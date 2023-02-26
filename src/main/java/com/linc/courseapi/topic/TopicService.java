package com.linc.courseapi.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
  private List<Topic> topics = Arrays.asList(
      new Topic("spring", "Spring Framework", "Spring Framework Description"),
      new Topic("java", "Core Java", "Core Java Description"),
      new Topic("javascript", "JavaScript", "JavaScript Description"));

  public List<Topic> getAllTopics() {
    return this.topics;
  }

  public Topic getTopic(String id) {
    return this.topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
  }
}
