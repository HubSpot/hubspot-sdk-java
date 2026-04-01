// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.associationsschema

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.models.crm.associationsschema.BatchInputPublicAssociationDefinitionConfigurationUpdateRequest
import com.hubspot_sdk.api.models.crm.associationsschema.BatchInputPublicAssociationSpec
import com.hubspot_sdk.api.models.crm.associationsschema.PublicAssociationDefinitionConfigurationUpdateRequest
import com.hubspot_sdk.api.models.crm.associationsschema.PublicAssociationSpec
import com.hubspot_sdk.api.models.crm.associationsschema.limits.LimitBatchDeleteParams
import com.hubspot_sdk.api.models.crm.associationsschema.limits.LimitBatchUpdateParams
import com.hubspot_sdk.api.models.crm.associationsschema.limits.LimitGetByObjectTypesParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class LimitServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val limitService = client.crm().associationsSchema().limits()

        val collectionResponsePublicAssociationDefinitionUserConfigurationNoPaging =
            limitService.list()

        collectionResponsePublicAssociationDefinitionUserConfigurationNoPaging.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun batchDelete() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val limitService = client.crm().associationsSchema().limits()

        limitService.batchDelete(
            LimitBatchDeleteParams.builder()
                .fromObjectType("fromObjectType")
                .toObjectType("toObjectType")
                .batchInputPublicAssociationSpec(
                    BatchInputPublicAssociationSpec.builder()
                        .addInput(
                            PublicAssociationSpec.builder().category("category").typeId(0).build()
                        )
                        .build()
                )
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun batchUpdate() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val limitService = client.crm().associationsSchema().limits()

        val batchResponsePublicAssociationDefinitionConfigurationUpdateResult =
            limitService.batchUpdate(
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

        batchResponsePublicAssociationDefinitionConfigurationUpdateResult.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getByObjectTypes() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val limitService = client.crm().associationsSchema().limits()

        val collectionResponsePublicAssociationDefinitionUserConfigurationNoPaging =
            limitService.getByObjectTypes(
                LimitGetByObjectTypesParams.builder()
                    .fromObjectType("fromObjectType")
                    .toObjectType("toObjectType")
                    .build()
            )

        collectionResponsePublicAssociationDefinitionUserConfigurationNoPaging.validate()
    }
}
