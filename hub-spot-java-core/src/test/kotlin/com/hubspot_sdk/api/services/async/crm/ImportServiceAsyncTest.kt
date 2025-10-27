// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot_sdk.api.models.crm.imports.ImportCreateParams
import com.hubspot_sdk.api.models.crm.imports.ImportListErrorsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ImportServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val importServiceAsync = client.crm().imports()

        val publicImportResponseFuture =
            importServiceAsync.create(
                ImportCreateParams.builder()
                    .files("some content".byteInputStream())
                    .importRequest("importRequest")
                    .build()
            )

        val publicImportResponse = publicImportResponseFuture.get()
        publicImportResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val importServiceAsync = client.crm().imports()

        val pageFuture = importServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun cancel() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val importServiceAsync = client.crm().imports()

        val actionResponseFuture = importServiceAsync.cancel(0L)

        val actionResponse = actionResponseFuture.get()
        actionResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val importServiceAsync = client.crm().imports()

        val publicImportResponseFuture = importServiceAsync.get(0L)

        val publicImportResponse = publicImportResponseFuture.get()
        publicImportResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listErrors() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val importServiceAsync = client.crm().imports()

        val collectionResponsePublicImportErrorForwardPagingFuture =
            importServiceAsync.listErrors(
                ImportListErrorsParams.builder()
                    .importId(0L)
                    .after("after")
                    .includeErrorMessage(true)
                    .includeRowData(true)
                    .limit(0)
                    .build()
            )

        val collectionResponsePublicImportErrorForwardPaging =
            collectionResponsePublicImportErrorForwardPagingFuture.get()
        collectionResponsePublicImportErrorForwardPaging.validate()
    }
}
