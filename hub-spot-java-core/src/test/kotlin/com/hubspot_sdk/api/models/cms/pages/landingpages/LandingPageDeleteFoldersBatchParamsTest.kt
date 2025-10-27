// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.pages.landingpages

import com.hubspot_sdk.api.models.BatchInputString
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LandingPageDeleteFoldersBatchParamsTest {

    @Test
    fun create() {
        LandingPageDeleteFoldersBatchParams.builder()
            .batchInputString(BatchInputString.builder().addInput("string").build())
            .build()
    }

    @Test
    fun body() {
        val params =
            LandingPageDeleteFoldersBatchParams.builder()
                .batchInputString(BatchInputString.builder().addInput("string").build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(BatchInputString.builder().addInput("string").build())
    }
}
