// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.pages.landingpages

import com.hubspot_sdk.api.models.BatchInputString
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LandingPageDeleteBatchParamsTest {

    @Test
    fun create() {
        LandingPageDeleteBatchParams.builder()
            .batchInputString(BatchInputString.builder().addInput("string").build())
            .build()
    }

    @Test
    fun body() {
        val params =
            LandingPageDeleteBatchParams.builder()
                .batchInputString(BatchInputString.builder().addInput("string").build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(BatchInputString.builder().addInput("string").build())
    }
}
