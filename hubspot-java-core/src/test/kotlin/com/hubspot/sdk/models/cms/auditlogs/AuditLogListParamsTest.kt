// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.auditlogs

import com.hubspot.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuditLogListParamsTest {

    @Test
    fun create() {
        AuditLogListParams.builder()
            .after("after")
            .before("before")
            .addEventType("string")
            .limit(0)
            .addObjectId("string")
            .addObjectType("string")
            .addSort("string")
            .addUserId("string")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            AuditLogListParams.builder()
                .after("after")
                .before("before")
                .addEventType("string")
                .limit(0)
                .addObjectId("string")
                .addObjectType("string")
                .addSort("string")
                .addUserId("string")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("after", "after")
                    .put("before", "before")
                    .put("eventType", listOf("string").joinToString(","))
                    .put("limit", "0")
                    .put("objectId", listOf("string").joinToString(","))
                    .put("objectType", listOf("string").joinToString(","))
                    .put("sort", listOf("string").joinToString(","))
                    .put("userId", listOf("string").joinToString(","))
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AuditLogListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
