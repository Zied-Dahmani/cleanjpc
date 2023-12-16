import com.example.cleanjpc.utils.AppResult

interface PostRepository {
    suspend fun getAllPosts(): AppResult<Post>
}