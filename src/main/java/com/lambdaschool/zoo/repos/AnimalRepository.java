package com.lambdaschool.zoo.repos;

import com.lambdaschool.zoo.model.Animal;
import com.lambdaschool.zoo.model.Zoo;
import com.lambdaschool.zoo.views.CountAnimalsInZoos;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface AnimalRepository extends CrudRepository<Animal, Long> {

   /* select z.animalid, a.animaltype, count(z.zooid) as countszoo
    from zooanimals z
    inner join zoo a
            on z.animalid=a.animalid
    group by z.animalid, a.animaltype*/

    @Query(value = "select z.animalid, a.animaltype, count(z.zooid) as countszoo\n" +
            "    from zooanimals z\n" +
            "    inner join zoo a\n" +
            "            on z.animalid=a.animalid\n" +
            "    group by z.animalid, a.animaltype", nativeQuery = true)
    ArrayList<CountAnimalsInZoos> getCountAnimalsInZoos();

    /* delete
     from zooanimals
             where zooid=*/
    @Modifying
    @Query(value = "delete \n" +
            "    from zooanimals\n" +
            "            where zooid=", nativeQuery = true)
    void deleteZoosFromZooanimals(long zooid);

}
