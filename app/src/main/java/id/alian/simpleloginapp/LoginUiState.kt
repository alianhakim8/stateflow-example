package id.alian.simpleloginapp

sealed class LoginUiState {
    object Success : LoginUiState()
    data class Error(val message: String) : LoginUiState()
    object Loading : LoginUiState()
    object EmptyState : LoginUiState()
}
