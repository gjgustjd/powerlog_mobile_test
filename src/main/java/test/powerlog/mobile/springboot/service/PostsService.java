package test.powerlog.mobile.springboot.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import test.powerlog.mobile.springboot.domain.posts.PostsRepository;
import test.powerlog.mobile.springboot.web.dto.PostsSaveRequestDto;

@RequiredArgsConstructor
@Service
public class PostsService {
    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto){
        return postsRepository.save(requestDto.toEntity()).getId();
    }
}
