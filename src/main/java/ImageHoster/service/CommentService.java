package ImageHoster.service;

import ImageHoster.model.Comment;
import ImageHoster.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

/**
 * @author Aman
 *
 */
@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

   // add comments to image
    public void addComment(Comment comment) {
        comment.setCreatedDate(LocalDate.now());
        commentRepository.addComment(comment);
    }
}
