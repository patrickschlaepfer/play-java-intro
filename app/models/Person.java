package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by patrick on 26.05.2015.
 */
@Entity
public class Person extends Model {

    @Id
    public String id;

    public String name;

}
