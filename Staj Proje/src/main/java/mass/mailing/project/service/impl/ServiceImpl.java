package mass.mailing.project.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import mass.mailing.project.entity.Recipient;
import mass.mailing.project.repository.RecipientRepository;
import mass.mailing.project.service.RecipientService;

@Service
public class ServiceImpl implements RecipientService {
	
	private RecipientRepository recipientRepository;
	

	public ServiceImpl(RecipientRepository recipientRepository) {
		super();
		this.recipientRepository = recipientRepository;
	}


	@Override
	public List<Recipient> getAllRecipients() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
