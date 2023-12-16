import android.content.Context
import com.example.cleanjpc.R
import com.example.cleanjpc.utils.AppResult
import java.text.SimpleDateFormat
import java.util.Locale

val Any.TAG: String
    get() {
        val tag = javaClass.simpleName
        return if (tag.length <= 23) tag else tag.substring(0, 23)
    }

fun Context.noNetworkConnectivityError(): AppResult.Error = AppResult.Error(Exception(this.resources.getString(
    androidx.compose.ui.R.string.default_error_message)))

fun String.formatDate(formatInput: String, formatOutput: String): String {
    val parser = SimpleDateFormat(formatInput, Locale.FRANCE)
    val formatter = SimpleDateFormat(formatOutput, Locale.FRANCE)
    return formatter.format(parser.parse(this) ?: return "")
}

