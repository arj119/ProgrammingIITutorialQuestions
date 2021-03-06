package tutorialquestions.questiondc38.acyclic;

import java.util.HashSet;
import java.util.Set;

public class GroupEmailAddress extends EmailAddress {

  private Set<EmailAddress> members;

  public GroupEmailAddress(String identifier) {
    super(identifier);
    members = new HashSet<EmailAddress>();
  }

  public void addEmailAddress(EmailAddress emailAddress) {
    members.add(emailAddress);
  }

  @Override
  public Set<EmailAddress> getTargets() {

    Set<EmailAddress> result = new HashSet<EmailAddress>();

    for (EmailAddress e : members) {
      result.addAll(e.getTargets());
    }

    return result;
  }

}
