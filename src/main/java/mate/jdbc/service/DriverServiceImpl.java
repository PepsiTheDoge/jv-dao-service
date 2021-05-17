package mate.jdbc.service;

import java.util.List;
import java.util.Optional;
import mate.jdbc.dao.DriverDao;
import mate.jdbc.lib.Inject;
import mate.jdbc.lib.Service;
import mate.jdbc.model.Driver;

@Service
public class DriverServiceImpl implements DriverService {
    @Inject
    private static DriverDao driverDao;

    @Override
    public List<Driver> getAll() {
        return driverDao.getAll();
    }

    @Override
    public Driver create(Driver driver) {
        return driverDao.create(driver);
    }

    @Override
    public Optional<Driver> get(Long id) {
        return driverDao.get(id);
    }

    @Override
    public Driver update(Driver driver) {
        return driverDao.update(driver);
    }

    @Override
    public boolean delete(Long id) {
        return driverDao.delete(id);
    }
}