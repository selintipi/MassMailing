package mass.mailing.project.controller;

import mass.mailing.project.entity.Recipient;
import mass.mailing.project.service.RecipientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RecipientController {

    private final RecipientService recipientService;

    @Autowired
    public RecipientController (RecipientService recipientService) {
        this.recipientService = recipientService;
    }

    @PostMapping("recipient/add")
    @ResponseBody
    public Recipient addRecipient(@RequestBody Recipient recipient) {
        return recipientService.add(recipient);
    }
}
