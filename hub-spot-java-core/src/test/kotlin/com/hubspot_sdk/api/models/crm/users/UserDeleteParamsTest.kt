// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.users

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserDeleteParamsTest {

    @Test
    fun create() {
        UserDeleteParams.builder().userId("userId").build()
    }

    @Test
    fun pathParams() {
        val params = UserDeleteParams.builder().userId("userId").build()

        assertThat(params._pathParam(0)).isEqualTo("userId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
