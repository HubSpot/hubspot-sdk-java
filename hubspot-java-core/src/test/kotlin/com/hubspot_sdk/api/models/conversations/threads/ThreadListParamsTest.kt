// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.threads

import com.hubspot_sdk.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ThreadListParamsTest {

    @Test
    fun create() {
        ThreadListParams.builder()
            .after("after")
            .archived(true)
            .associatedContactId(0L)
            .addAssociation(ThreadListParams.Association.TICKET)
            .addInboxId(0)
            .latestMessageTimestampAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .limit(0)
            .property("property")
            .addSort("string")
            .threadStatus("threadStatus")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ThreadListParams.builder()
                .after("after")
                .archived(true)
                .associatedContactId(0L)
                .addAssociation(ThreadListParams.Association.TICKET)
                .addInboxId(0)
                .latestMessageTimestampAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .limit(0)
                .property("property")
                .addSort("string")
                .threadStatus("threadStatus")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("after", "after")
                    .put("archived", "true")
                    .put("associatedContactId", "0")
                    .put("association", listOf("TICKET").joinToString(","))
                    .put("inboxId", listOf("0").joinToString(","))
                    .put("latestMessageTimestampAfter", "2019-12-27T18:11:19.117Z")
                    .put("limit", "0")
                    .put("property", "property")
                    .put("sort", listOf("string").joinToString(","))
                    .put("threadStatus", "threadStatus")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ThreadListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
