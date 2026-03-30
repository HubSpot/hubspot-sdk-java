// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.actions.definitions

import com.hubspot_sdk.api.models.automation.actions.PublicActionDefinitionRequiresObjectRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DefinitionCreateRequiresObjectParamsTest {

    @Test
    fun create() {
        DefinitionCreateRequiresObjectParams.builder()
            .appId(0)
            .definitionId("definitionId")
            .publicActionDefinitionRequiresObjectRequest(
                PublicActionDefinitionRequiresObjectRequest.builder().requiresObject(true).build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            DefinitionCreateRequiresObjectParams.builder()
                .appId(0)
                .definitionId("definitionId")
                .publicActionDefinitionRequiresObjectRequest(
                    PublicActionDefinitionRequiresObjectRequest.builder()
                        .requiresObject(true)
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        assertThat(params._pathParam(1)).isEqualTo("definitionId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            DefinitionCreateRequiresObjectParams.builder()
                .appId(0)
                .definitionId("definitionId")
                .publicActionDefinitionRequiresObjectRequest(
                    PublicActionDefinitionRequiresObjectRequest.builder()
                        .requiresObject(true)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PublicActionDefinitionRequiresObjectRequest.builder().requiresObject(true).build()
            )
    }
}
