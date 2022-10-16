package mate.academy.hibernate.relations.service.impl;

import mate.academy.hibernate.relations.dao.ActorDao;
import mate.academy.hibernate.relations.dao.impl.AbstractDao;
import mate.academy.hibernate.relations.model.Actor;
import mate.academy.hibernate.relations.service.ActorService;

public class ActorServiceImpl implements ActorService {
    private AbstractDao abstractDao;

    public ActorServiceImpl(AbstractDao abstractDao) {
        this.abstractDao = abstractDao;
    }

    @Override
    public Actor add(Actor actor) {
        return ((ActorDao) abstractDao).add(actor);
    }

    @Override
    public Actor get(Long id) {
        return ((ActorDao) abstractDao).get(id).get();
    }
}
