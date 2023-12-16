import com.example.cleanjpc.domain.use_case.PostUseCase
import org.koin.dsl.module

val useCaseModule = module {
    single { PostUseCase(postRepository = get()) }
}