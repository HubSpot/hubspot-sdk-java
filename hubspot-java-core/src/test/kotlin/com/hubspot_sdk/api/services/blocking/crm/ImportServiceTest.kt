// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.models.crm.imports.ImportCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ImportServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val importService = client.crm().imports()

        val publicImportResponse =
            importService.create(
                ImportCreateParams.builder()
                    .files("Example data".byteInputStream())
                    .importRequest("importRequest")
                    .build()
            )

        publicImportResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val importService = client.crm().imports()

        val page = importService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun cancel() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val importService = client.crm().imports()

        val actionResponse = importService.cancel(0L)

        actionResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val importService = client.crm().imports()

        val publicImportResponse = importService.get(0L)

        publicImportResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listErrors() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val importService = client.crm().imports()

        val page = importService.listErrors(0L)

        page.response().validate()
    }
}
