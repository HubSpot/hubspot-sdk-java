// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.hubdb.tables

import com.hubspot.models.cms.hubdb.HubDbTableCloneRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TableCloneDraftParamsTest {

    @Test
    fun create() {
        TableCloneDraftParams.builder()
            .tableIdOrName("tableIdOrName")
            .hubDbTableCloneRequest(
                HubDbTableCloneRequest.builder()
                    .copyRows(true)
                    .isHubSpotDefined(true)
                    .newLabel("newLabel")
                    .newName("newName")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            TableCloneDraftParams.builder()
                .tableIdOrName("tableIdOrName")
                .hubDbTableCloneRequest(
                    HubDbTableCloneRequest.builder().copyRows(true).isHubSpotDefined(true).build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("tableIdOrName")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            TableCloneDraftParams.builder()
                .tableIdOrName("tableIdOrName")
                .hubDbTableCloneRequest(
                    HubDbTableCloneRequest.builder()
                        .copyRows(true)
                        .isHubSpotDefined(true)
                        .newLabel("newLabel")
                        .newName("newName")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                HubDbTableCloneRequest.builder()
                    .copyRows(true)
                    .isHubSpotDefined(true)
                    .newLabel("newLabel")
                    .newName("newName")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TableCloneDraftParams.builder()
                .tableIdOrName("tableIdOrName")
                .hubDbTableCloneRequest(
                    HubDbTableCloneRequest.builder().copyRows(true).isHubSpotDefined(true).build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                HubDbTableCloneRequest.builder().copyRows(true).isHubSpotDefined(true).build()
            )
    }
}
