package pl.iridium405.twitter_like.conversation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


@Repository
@Transactional
public interface ConversationRepository extends JpaRepository<Conversation, Long> {
}
