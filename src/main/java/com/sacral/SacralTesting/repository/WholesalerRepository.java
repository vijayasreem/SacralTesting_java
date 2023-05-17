·       User should be able to access the sub functionalities like edit, view and download.·       User should able to download the branch as .csv file.·       User should able to find the sub functionalities when he clicks user’s functionality.·       User should able to access the sub functionalities like edit, view and download.·       User should have the option of filtering the data using the drop down menu.·       User should able to add/edit the wholesaler.·       User should able to reset the selections to the last search.


@Repository
public interface WholesalerRepository extends JpaRepository<WholesalerEntity, Long> {

    List<WholesalerEntity> findByName(String name);
    List<WholesalerEntity> findByNumber(String number);
    List<WholesalerEntity> findByType(String type);
    List<WholesalerEntity> findByContactName(String contactName);
    List<WholesalerEntity> findByEmailAddress(String emailAddress);
    List<WholesalerEntity> findByActive(Boolean active);
    List<WholesalerEntity> findByDateCreated(LocalDateTime dateCreated);
    List<WholesalerEntity> findByLastModified(LocalDateTime lastModified);

}