·       Ability to access the sub functionalities like edit, view and download.·       Ability to download the branches as format of .csv file·       User able to find the sub functionalities when he clicks user’s functionality.·       User able to access the sub functionalities like edit, view and download.·       If user has access then user able to access this page.·       If user didn’t have access then redirect to login page.·       User name should not be empty; username should be unique.·       Number should not be empty and should be number "/^\d+$/" and should be unique.·       Clicking on Download Data will allow User to view the results in Excel format.·       User have the option of filtering the data using the drop down menu·       Type - This drop down menu will allowing User to select the type User wish to add/edit.·       The Submit and Reset buttons are given on this screen.·       Once User have made User selections click on Submit it will add/edit the wholesaler, or click on Reset to reset the selections to the last search.

package com.sacral.SacralTesting.repository;

import com.sacral.SacralTesting.model.Wholesalers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface WholesalersRepository extends JpaRepository<Wholesalers, Long> {

    // Get a list of Wholesalers
    List<Wholesalers> findAll();

    // Get a Wholesaler by ID
    Wholesalers findById(Long id);

    // Get a Wholesaler by Name
    Wholesalers findByName(String name);

    // Get a Wholesaler by Number
    Wholesalers findByNumber(String number);

    // Get a Wholesaler by Type
    @Query(value = "SELECT * FROM wholesalers WHERE type = :type", nativeQuery = true)
    Wholesalers findByType(@Param("type") String type);

    // Get a Wholesaler by Contact Name
    Wholesalers findByContactName(String contactName);

    // Get a Wholesaler by Email Address
    Wholesalers findByEmailAddress(String emailAddress);

    // Get a Wholesaler by Active Status
    Wholesalers findByActive(boolean active);

    // Get a Wholesaler by Date Created
    Wholesalers findByDateCreated(String dateCreated);

    // Get a Wholesaler by Last Modified
    Wholesalers findByLastModified(String lastModified);

}