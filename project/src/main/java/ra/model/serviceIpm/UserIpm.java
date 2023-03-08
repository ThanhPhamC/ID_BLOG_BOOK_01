package ra.model.serviceIpm;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import ra.model.repository.UserRepository;
import ra.model.service.UserService;
@Service
@AllArgsConstructor
public class UserIpm<Users,Integer> implements UserService<Users,Integer> {
    private UserRepository userRepo;
    @Override
    public Page<Users> listUser(Pageable pageable) {
        return (Page<Users>) userRepo.findAll(pageable);
    }
    @Override
    public Users saveOrUpdate(Users users) {
        return null;
    }
    @Override
    public Users findById(Integer id) {
        return null;
    }
    @Override
    public Page<Users> findByName(String name, Pageable pageable) {
        return null;
    }
}
