// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.hubdb.tables

import com.hubspot.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TableListDraftParamsTest {

    @Test
    fun create() {
        TableListDraftParams.builder()
            .after("after")
            .archived(true)
            .contentType("contentType")
            .createdAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .createdBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .isGetLocalizedSchema(true)
            .limit(0)
            .addSort("string")
            .updatedAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .updatedBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            TableListDraftParams.builder()
                .after("after")
                .archived(true)
                .contentType("contentType")
                .createdAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .isGetLocalizedSchema(true)
                .limit(0)
                .addSort("string")
                .updatedAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("after", "after")
                    .put("archived", "true")
                    .put("contentType", "contentType")
                    .put("createdAfter", "2019-12-27T18:11:19.117Z")
                    .put("createdAt", "2019-12-27T18:11:19.117Z")
                    .put("createdBefore", "2019-12-27T18:11:19.117Z")
                    .put("isGetLocalizedSchema", "true")
                    .put("limit", "0")
                    .put("sort", listOf("string").joinToString(","))
                    .put("updatedAfter", "2019-12-27T18:11:19.117Z")
                    .put("updatedAt", "2019-12-27T18:11:19.117Z")
                    .put("updatedBefore", "2019-12-27T18:11:19.117Z")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TableListDraftParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
