package ejercicio_4;



import org.jdbi.v3.core.Jdbi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class PersonaRepository {

    private Jdbi jdbi;

    public PersonaRepository(Jdbi jdbi) {
        this.jdbi = jdbi;
    }

    /**
     * Busca por nombre a parte
     */
    public List<Persona> buscarPorNombre(String nombreOParte) throws IllegalArgumentException {

        validacionNombreOParte(nombreOParte);
        return jdbi.withHandle(handle -> {
            var rs = handle
                    .select("select nombre, apellido from persona where nombre like ?")
                    .bind(0, "%" + nombreOParte + "%").mapToMap(String.class).list();

            var personas = new ArrayList<Persona>();


            for (Map<String, String> map : rs) {
                personas.add(new Persona(map.get("nombre"), map.get("apellido")));
            }

            return personas;
        });

    }


    /**
     * Dado un id, retorna:
     * - null si el id no se encuentra en la BD
     * - la instancia de Persona encontrada
     */
    public Optional<Persona> buscarId(Long id) throws IllegalArgumentException {

        validacionId(id);
        return jdbi.withHandle(handle -> {

            var rs = handle
                    .select("select nombre, apellido from persona where id_persona = ?")
                    .bind(0, id).mapToMap(String.class).list();

            if (rs.isEmpty()) {
                return Optional.empty();
            }

            return Optional.of(new Persona(rs.get(0).get("nombre"), rs.get(0).get("apellido")));

        });
    }

    private void validacionId( Long id) throws IllegalArgumentException {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("El id debe ser un número positivo");
        }
    }

    private void validacionNombreOParte( String nombreOParte) throws IllegalArgumentException {
        if(nombreOParte == null || nombreOParte.isBlank()){
            throw new IllegalArgumentException("El nombre o parte del nombre no puede ser nulo o vacío");
        }
    }
}