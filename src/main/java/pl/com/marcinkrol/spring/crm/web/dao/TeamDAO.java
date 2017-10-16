/*
 * Copyright 2011-08-31 the original author or authors.
 */

package pl.com.marcinkrol.spring.crm.web.dao;

import org.springframework.data.repository.CrudRepository;
import pl.com.marcinkrol.spring.crm.web.model.Team;

public interface TeamDAO extends CrudRepository<Team, Integer> {

}
