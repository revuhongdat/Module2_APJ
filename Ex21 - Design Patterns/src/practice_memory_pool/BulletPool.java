package practice_memory_pool;

public class BulletPool extends MemoryPool{
    @Override
    protected Bullet allocate() {
        return new Bullet();
    }
}
