import android.content.Context
import com.example.cleanjpc.api.PostApi
import com.example.cleanjpc.data.repository.PostRepositoryImpl
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val repositoryModule = module {
    fun providePostRepository(api: PostApi, context: Context): PostRepository = PostRepositoryImpl(api, context)
    single { providePostRepository(get(), androidContext()) }
}