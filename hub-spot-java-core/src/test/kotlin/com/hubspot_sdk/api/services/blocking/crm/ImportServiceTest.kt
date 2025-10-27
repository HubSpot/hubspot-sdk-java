// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClient
import com.hubspot_sdk.api.models.crm.imports.ImportCreateParams
import com.hubspot_sdk.api.models.crm.imports.ImportListErrorsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ImportServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val importService = client.crm().imports()

        val publicImportResponse =
            importService.create(
                ImportCreateParams.builder()
                    .files("some content".byteInputStream())
                    .importRequest("importRequest")
                    .build()
            )

        publicImportResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val importService = client.crm().imports()

        val page = importService.list()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun cancel() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val importService = client.crm().imports()

        val actionResponse = importService.cancel(0L)

        actionResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val importService = client.crm().imports()

        val publicImportResponse = importService.get(0L)

        publicImportResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listErrors() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val importService = client.crm().imports()

        val collectionResponsePublicImportErrorForwardPaging =
            importService.listErrors(
                ImportListErrorsParams.builder()
                    .importId(0L)
                    .after("after")
                    .includeErrorMessage(true)
                    .includeRowData(true)
                    .limit(0)
                    .build()
            )

        collectionResponsePublicImportErrorForwardPaging.validate()
    }
}
