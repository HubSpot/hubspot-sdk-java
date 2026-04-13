// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.automation.actions

import com.hubspot.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot.models.automation.actions.revisions.RevisionGetParams
import com.hubspot.models.automation.actions.revisions.RevisionListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RevisionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val revisionServiceAsync = client.automation().actions().revisions()

        val pageFuture =
            revisionServiceAsync.list(
                RevisionListParams.builder().appId(0).definitionId("definitionId").build()
            )

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
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
