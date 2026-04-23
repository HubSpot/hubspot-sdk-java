// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.cms

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClient
import com.hubspot.sdk.models.cms.sourcecode.FileExtractRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SourceCodeServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun extractAsync() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val sourceCodeService = client.cms().sourceCode()

        val taskLocator =
            sourceCodeService.extractAsync(FileExtractRequest.builder().path("path").build())

        taskLocator.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getExtractionStatus() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val sourceCodeService = client.cms().sourceCode()

        val actionResponse = sourceCodeService.getExtractionStatus(0)

        actionResponse.validate()
    }
}
