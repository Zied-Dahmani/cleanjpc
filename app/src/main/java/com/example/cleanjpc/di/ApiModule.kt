import com.example.cleanjpc.api.PostApi
import org.koin.dsl.module
import retrofit2.Retrofit

val apiModule = module {
    fun providePostApi(retrofit: Retrofit): PostApi = retrofit.create(PostApi::class.java)
    single { providePostApi(get()) }
}