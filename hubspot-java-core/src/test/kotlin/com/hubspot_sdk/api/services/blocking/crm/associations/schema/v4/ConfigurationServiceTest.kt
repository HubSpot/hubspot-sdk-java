// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.associations.schema.v4

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.models.crm.associations.schema.v4.BatchInputPublicAssociationDefinitionConfigurationCreateRequest
import com.hubspot_sdk.api.models.crm.associations.schema.v4.BatchInputPublicAssociationDefinitionConfigurationUpdateRequest
import com.hubspot_sdk.api.models.crm.associations.schema.v4.BatchInputPublicAssociationSpec
import com.hubspot_sdk.api.models.crm.associations.schema.v4.PublicAssociationDefinitionConfigurationCreateRequest
import com.hubspot_sdk.api.models.crm.associations.schema.v4.PublicAssociationDefinitionConfigurationUpdateRequest
import com.hubspot_sdk.api.models.crm.associations.schema.v4.PublicAssociationSpec
import com.hubspot_sdk.api.models.crm.associations.schema.v4.configurations.ConfigurationBatchCreateParams
import com.hubspot_sdk.api.models.crm.associations.schema.v4.configurations.ConfigurationBatchDeleteParams
import com.hubspot_sdk.api.models.crm.associations.schema.v4.configurations.ConfigurationBatchUpdateParams
import com.hubspot_sdk.api.models.crm.associations.schema.v4.configurations.ConfigurationGetByObjectTypesParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ConfigurationServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val configurationService = client.crm().associations().schema().v4().configurations()

        val collectionResponsePublicAssociationDefinitionUserConfiguration =
            configurationService.list()

        collectionResponsePublicAssociationDefinitionUserConfiguration.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun batchCreate() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val configurationService = client.crm().associations().schema().v4().configurations()

        val batchResponsePublicAssociationDefinitionUserConfiguration =
            configurationService.batchCreate(
                ConfigurationBatchCreateParams.builder()
                    .fromObjectType("fromObjectType")
                    .toObjectType("toObjectType")
                    .batchInputPublicAssociationDefinitionConfigurationCreateRequest(
                        BatchInputPublicAssociationDefinitionConfigurationCreateRequest.builder()
                            .addInput(
                                PublicAssociationDefinitionConfigurationCreateRequest.builder()
                                    .category(
                                        PublicAssociationDefinitionConfigurationCreateRequest
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

        batchResponsePublicAssociationDefinitionUserConfiguration.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun batchDelete() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val configurationService = client.crm().associations().schema().v4().configurations()

        val batchResponseVoid =
            configurationService.batchDelete(
                ConfigurationBatchDeleteParams.builder()
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

        batchResponseVoid.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun batchUpdate() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val configurationService = client.crm().associations().schema().v4().configurations()

        val batchResponsePublicAssociationDefinitionConfigurationUpdateResult =
            configurationService.batchUpdate(
                ConfigurationBatchUpdateParams.builder()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun getByObjectTypes() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val configurationService = client.crm().associations().schema().v4().configurations()

        val collectionResponsePublicAssociationDefinitionUserConfiguration =
            configurationService.getByObjectTypes(
                ConfigurationGetByObjectTypesParams.builder()
                    .fromObjectType("fromObjectType")
                    .toObjectType("toObjectType")
                    .build()
            )

        collectionResponsePublicAssociationDefinitionUserConfiguration.validate()
    }
}
