// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.conversations

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.models.conversations.PublicThreadUpdateRequest
import com.hubspot_sdk.api.models.conversations.threads.ThreadGetParams
import com.hubspot_sdk.api.models.conversations.threads.ThreadUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ThreadServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val threadService = client.conversations().threads()

        val publicThread =
            threadService.update(
                ThreadUpdateParams.builder()
                    .threadId(0L)
                    .queryArchived(true)
                    .publicThreadUpdateRequest(
                        PublicThreadUpdateRequest.builder()
                            .archived(true)
                            .status(PublicThreadUpdateRequest.Status.CLOSED)
                            .build()
                    )
                    .build()
            )

        publicThread.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val threadService = client.conversations().threads()

        val page = threadService.list()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val threadService = client.conversations().threads()

        threadService.delete(0L)
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val threadService = client.conversations().threads()

        val publicThread =
            threadService.get(
                ThreadGetParams.builder()
                    .threadId(0L)
                    .archived(true)
                    .addAssociation(ThreadGetParams.Association.TICKET)
                    .property("property")
                    .build()
            )

        publicThread.validate()
    }
}
