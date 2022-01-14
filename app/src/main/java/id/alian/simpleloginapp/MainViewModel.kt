package id.alian.simpleloginapp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    private val _loginUiState = MutableStateFlow<LoginUiState>(LoginUiState.EmptyState)
    val loginUiState: StateFlow<LoginUiState> = _loginUiState

    fun login(email: String, password: String) {
        viewModelScope.launch {
            _loginUiState.value = LoginUiState.Loading
            delay(3000L)
            if (email == "Alianhakim9@gmail.com" && password == "Otherside123") {
                _loginUiState.value = LoginUiState.Success
            } else {
                _loginUiState.value = LoginUiState.Error("Email or password incorrect")
            }
        }
    }
}