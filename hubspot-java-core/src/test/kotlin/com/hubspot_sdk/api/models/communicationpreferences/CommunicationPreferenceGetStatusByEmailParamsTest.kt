// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.communicationpreferences

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommunicationPreferenceGetStatusByEmailParamsTest {

    @Test
    fun create() {
        CommunicationPreferenceGetStatusByEmailParams.builder().emailAddress("emailAddress").build()
    }

    @Test
    fun pathParams() {
        val params =
            CommunicationPreferenceGetStatusByEmailParams.builder()
                .emailAddress("emailAddress")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("emailAddress")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
