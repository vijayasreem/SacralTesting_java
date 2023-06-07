@Repository
public interface TestTestUserStoryRepository extends JpaRepository<TestTestUserStory, Long> {

    List<TestTestUserStory> findByName(String name);
    List<TestTestUserStory> findByDescription(String description);
    List<TestTestUserStory> findByStatus(String status);
    List<TestTestUserStory> findByPriority(String priority);
    List<TestTestUserStory> findByCreatedBy(String createdBy);
    List<TestTestUserStory> findByCreatedOn(LocalDateTime createdOn);
    List<TestTestUserStory> findByUpdatedBy(String updatedBy);
    List<TestTestUserStory> findByUpdatedOn(LocalDateTime updatedOn);

}