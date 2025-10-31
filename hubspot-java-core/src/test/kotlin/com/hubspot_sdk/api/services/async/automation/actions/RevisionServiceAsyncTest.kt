// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.automation.actions

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.automation.actions.revisions.RevisionGetParams
import com.hubspot_sdk.api.models.automation.actions.revisions.RevisionListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RevisionServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val revisionServiceAsync = client.automation().actions().revisions()

        val pageFuture =
            revisionServiceAsync.list(
                RevisionListParams.builder().appId(0).definitionId("definitionId").build()
            )

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val revisionServiceAsync = client.automation().actions().revisions()

        val publicActionRevisionFuture =
            revisionServiceAsync.get(
                RevisionGetParams.builder()
                    .appId(0)
                    .definitionId("definitionId")
                    .revisionId("revisionId")
                    .build()
            )

        val publicActionRevision = publicActionRevisionFuture.get()
        publicActionRevision.validate()
    }
}
