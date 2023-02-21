package kodlama.io.devs.odev.DataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.devs.odev.entities.concretes.Frameworks;

public interface FrameworkRepository extends JpaRepository<Frameworks, Integer> {

}
