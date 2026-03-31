// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.associationsschema

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.crm.associationsschema.BatchInputPublicAssociationDefinitionConfigurationUpdateRequest
import com.hubspot_sdk.api.models.crm.associationsschema.BatchInputPublicAssociationSpec
import com.hubspot_sdk.api.models.crm.associationsschema.PublicAssociationDefinitionConfigurationUpdateRequest
import com.hubspot_sdk.api.models.crm.associationsschema.PublicAssociationSpec
import com.hubspot_sdk.api.models.crm.associationsschema.limits.LimitBatchDeleteParams
import com.hubspot_sdk.api.models.crm.associationsschema.limits.LimitBatchUpdateParams
import com.hubspot_sdk.api.models.crm.associationsschema.limits.LimitGetByObjectTypesParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class LimitServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val limitServiceAsync = client.crm().associationsSchema().limits()

        val collectionResponsePublicAssociationDefinitionUserConfigurationNoPagingFuture =
            limitServiceAsync.list()

        val collectionResponsePublicAssociationDefinitionUserConfigurationNoPaging =
            collectionResponsePublicAssociationDefinitionUserConfigurationNoPagingFuture.get()
        collectionResponsePublicAssociationDefinitionUserConfigurationNoPaging.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun batchDelete() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val limitServiceAsync = client.crm().associationsSchema().limits()

        val batchResponseVoidFuture =
            limitServiceAsync.batchDelete(
                LimitBatchDeleteParams.builder()
                    .fromObjectType("fromObjectType")
                    .toObjectType("toObjectType")
                    .batchInputPublicAssociationSpec(
                        BatchInputPublicAssociationSpec.builder()
                            .addInput(
                                PublicAssociationSpec.builder()
                                    .category("category")
                                    .typeId(0)
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        val batchResponseVoid = batchResponseVoidFuture.get()
        batchResponseVoid.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun batchUpdate() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val limitServiceAsync = client.crm().associationsSchema().limits()

        val batchResponsePublicAssociationDefinitionConfigurationUpdateResultFuture =
            limitServiceAsync.batchUpdate(
                LimitBatchUpdateParams.builder()
                    .fromObjectType("fromObjectType")
                    .toObjectType("toObjectType")
                    .batchInputPublicAssociationDefinitionConfigurationUpdateRequest(
                        BatchInputPublicAssociationDefinitionConfigurationUpdateRequest.builder()
                            .addInput(
                                PublicAssociationDefinitionConfigurationUpdateRequest.builder()
                                    .category(
                                        PublicAssociationDefinitionConfigurationUpdateRequest
                                            .Category
                                            .HUBSPOT_DEFINED
                                    )
                                    .maxToObjectIds(0)
                                    .typeId(0)
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        val batchResponsePublicAssociationDefinitionConfigurationUpdateResult =
            batchResponsePublicAssociationDefinitionConfigurationUpdateResultFuture.get()
        batchResponsePublicAssociationDefinitionConfigurationUpdateResult.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getByObjectTypes() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val limitServiceAsync = client.crm().associationsSchema().limits()

        val collectionResponsePublicAssociationDefinitionUserConfigurationNoPagingFuture =
            limitServiceAsync.getByObjectTypes(
                LimitGetByObjectTypesParams.builder()
                    .fromObjectType("fromObjectType")
                    .toObjectType("toObjectType")
                    .build()
            )

        val collectionResponsePublicAssociationDefinitionUserConfigurationNoPaging =
            collectionResponsePublicAssociationDefinitionUserConfigurationNoPagingFuture.get()
        collectionResponsePublicAssociationDefinitionUserConfigurationNoPaging.validate()
    }
}
