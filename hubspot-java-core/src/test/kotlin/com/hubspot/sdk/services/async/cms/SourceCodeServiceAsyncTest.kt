// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.cms

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot.sdk.models.cms.sourcecode.FileExtractRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SourceCodeServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun extractAsync() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val sourceCodeServiceAsync = client.cms().sourceCode()

        val taskLocatorFuture =
            sourceCodeServiceAsync.extractAsync(FileExtractRequest.builder().path("path").build())

        val taskLocator = taskLocatorFuture.get()
        taskLocator.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getExtractionStatus() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val sourceCodeServiceAsync = client.cms().sourceCode()

        val actionResponseFuture = sourceCodeServiceAsync.getExtractionStatus(0)

        val actionResponse = actionResponseFuture.get()
        actionResponse.validate()
    }
}
