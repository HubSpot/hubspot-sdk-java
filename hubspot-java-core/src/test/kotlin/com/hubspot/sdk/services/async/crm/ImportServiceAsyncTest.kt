// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.crm

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot.sdk.models.crm.imports.ImportCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ImportServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val importServiceAsync = client.crm().imports()

        val publicImportResponseFuture =
            importServiceAsync.create(
                ImportCreateParams.builder()
                    .files("Example data".byteInputStream())
                    .importRequest("importRequest")
                    .build()
            )

        val publicImportResponse = publicImportResponseFuture.get()
        publicImportResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val importServiceAsync = client.crm().imports()

        val pageFuture = importServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun cancel() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val importServiceAsync = client.crm().imports()

        val actionResponseFuture = importServiceAsync.cancel(0L)

        val actionResponse = actionResponseFuture.get()
        actionResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val importServiceAsync = client.crm().imports()

        val publicImportResponseFuture = importServiceAsync.get(0L)

        val publicImportResponse = publicImportResponseFuture.get()
        publicImportResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listErrors() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val importServiceAsync = client.crm().imports()

        val pageFuture = importServiceAsync.listErrors(0L)

        val page = pageFuture.get()
        page.response().validate()
    }
}
