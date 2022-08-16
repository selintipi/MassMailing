package mass.mailing.project.service;

import mass.mailing.project.entity.Recipient;
import mass.mailing.project.repository.RecipientRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface RecipientService {

  /*  private final RecipientRepository recipientRepository;

    @Autowired
    public RecipientService(RecipientRepository recipientRepository) {
        this.recipientRepository = recipientRepository;
    }

    public Recipient add(Recipient recipient) {
        return recipientRepository.save(recipient);
    }
*/
	List<Recipient> getAllRecipients();
}
