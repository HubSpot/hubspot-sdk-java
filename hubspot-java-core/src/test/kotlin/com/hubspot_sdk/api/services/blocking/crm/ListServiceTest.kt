// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.crm.lists.BatchInputRecordIdInput
import com.hubspot_sdk.api.models.crm.lists.ListAddAndRemoveMembershipsParams
import com.hubspot_sdk.api.models.crm.lists.ListAddMembershipsFromParams
import com.hubspot_sdk.api.models.crm.lists.ListAddMembershipsParams
import com.hubspot_sdk.api.models.crm.lists.ListCreateRequest
import com.hubspot_sdk.api.models.crm.lists.ListFilterUpdateRequest
import com.hubspot_sdk.api.models.crm.lists.ListFolderCreateRequest
import com.hubspot_sdk.api.models.crm.lists.ListGetByObjectTypeAndNameParams
import com.hubspot_sdk.api.models.crm.lists.ListGetIdMappingParams
import com.hubspot_sdk.api.models.crm.lists.ListGetParams
import com.hubspot_sdk.api.models.crm.lists.ListGetRecordMembershipsParams
import com.hubspot_sdk.api.models.crm.lists.ListGetSizeAndEditsHistoryBetweenParams
import com.hubspot_sdk.api.models.crm.lists.ListListFoldersParams
import com.hubspot_sdk.api.models.crm.lists.ListListParams
import com.hubspot_sdk.api.models.crm.lists.ListMoveFolderParams
import com.hubspot_sdk.api.models.crm.lists.ListMoveRequest
import com.hubspot_sdk.api.models.crm.lists.ListRemoveMembershipsParams
import com.hubspot_sdk.api.models.crm.lists.ListRenameFolderParams
import com.hubspot_sdk.api.models.crm.lists.ListSearchRequest
import com.hubspot_sdk.api.models.crm.lists.ListUpdateListFiltersParams
import com.hubspot_sdk.api.models.crm.lists.ListUpdateListNameParams
import com.hubspot_sdk.api.models.crm.lists.ListUpdateScheduleConversionParams
import com.hubspot_sdk.api.models.crm.lists.MembershipChangeRequest
import com.hubspot_sdk.api.models.crm.lists.PublicAndFilterBranch
import com.hubspot_sdk.api.models.crm.lists.PublicAssociationFilterBranch
import com.hubspot_sdk.api.models.crm.lists.PublicBoolPropertyOperation
import com.hubspot_sdk.api.models.crm.lists.PublicListConversionDate
import com.hubspot_sdk.api.models.crm.lists.PublicListPermissions
import com.hubspot_sdk.api.models.crm.lists.PublicMembershipSettings
import com.hubspot_sdk.api.models.crm.lists.PublicNotAllFilterBranch
import com.hubspot_sdk.api.models.crm.lists.PublicNotAnyFilterBranch
import com.hubspot_sdk.api.models.crm.lists.PublicNumOccurrencesRefineBy
import com.hubspot_sdk.api.models.crm.lists.PublicOrFilterBranch
import com.hubspot_sdk.api.models.crm.lists.PublicPropertyAssociationFilterBranch
import com.hubspot_sdk.api.models.crm.lists.PublicPropertyFilter
import com.hubspot_sdk.api.models.crm.lists.PublicRestrictedFilterBranch
import com.hubspot_sdk.api.models.crm.lists.PublicUnifiedEventsFilterBranch
import com.hubspot_sdk.api.models.crm.lists.RecordIdInput
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ListServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val listService = client.crm().lists()

        val listCreateResponse =
            listService.create(
                ListCreateRequest.builder()
                    .name("name")
                    .objectTypeId("objectTypeId")
                    .processingType("processingType")
                    .customProperties(
                        ListCreateRequest.CustomProperties.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .filterBranch(
                        PublicOrFilterBranch.builder()
                            .addFilterBranch(
                                PublicAndFilterBranch.builder()
                                    .addFilterBranch(
                                        PublicNotAllFilterBranch.builder()
                                            .addFilterBranch(
                                                PublicNotAnyFilterBranch.builder()
                                                    .addFilterBranch(
                                                        PublicRestrictedFilterBranch.builder()
                                                            .addFilterBranch(
                                                                PublicUnifiedEventsFilterBranch
                                                                    .builder()
                                                                    .eventTypeId("eventTypeId")
                                                                    .addFilterBranch(
                                                                        PublicPropertyAssociationFilterBranch
                                                                            .builder()
                                                                            .addFilterBranch(
                                                                                PublicAssociationFilterBranch
                                                                                    .builder()
                                                                                    .associationCategory(
                                                                                        "associationCategory"
                                                                                    )
                                                                                    .associationTypeId(
                                                                                        0
                                                                                    )
                                                                                    .addFilterBranch(
                                                                                        PublicOrFilterBranch
                                                                                            .builder()
                                                                                            .filterBranches(
                                                                                                listOf()
                                                                                            )
                                                                                            .filterBranchOperator(
                                                                                                "filterBranchOperator"
                                                                                            )
                                                                                            .filterBranchType(
                                                                                                PublicOrFilterBranch
                                                                                                    .FilterBranchType
                                                                                                    .OR
                                                                                            )
                                                                                            .addFilter(
                                                                                                PublicPropertyFilter
                                                                                                    .builder()
                                                                                                    .filterType(
                                                                                                        PublicPropertyFilter
                                                                                                            .FilterType
                                                                                                            .PROPERTY
                                                                                                    )
                                                                                                    .operation(
                                                                                                        PublicBoolPropertyOperation
                                                                                                            .builder()
                                                                                                            .includeObjectsWithNoValueSet(
                                                                                                                true
                                                                                                            )
                                                                                                            .operationType(
                                                                                                                PublicBoolPropertyOperation
                                                                                                                    .OperationType
                                                                                                                    .BOOL
                                                                                                            )
                                                                                                            .operator(
                                                                                                                "operator"
                                                                                                            )
                                                                                                            .value(
                                                                                                                true
                                                                                                            )
                                                                                                            .build()
                                                                                                    )
                                                                                                    .property(
                                                                                                        "property"
                                                                                                    )
                                                                                                    .build()
                                                                                            )
                                                                                            .build()
                                                                                    )
                                                                                    .filterBranchOperator(
                                                                                        "filterBranchOperator"
                                                                                    )
                                                                                    .filterBranchType(
                                                                                        PublicAssociationFilterBranch
                                                                                            .FilterBranchType
                                                                                            .ASSOCIATION
                                                                                    )
                                                                                    .addFilter(
                                                                                        PublicPropertyFilter
                                                                                            .builder()
                                                                                            .filterType(
                                                                                                PublicPropertyFilter
                                                                                                    .FilterType
                                                                                                    .PROPERTY
                                                                                            )
                                                                                            .operation(
                                                                                                PublicBoolPropertyOperation
                                                                                                    .builder()
                                                                                                    .includeObjectsWithNoValueSet(
                                                                                                        true
                                                                                                    )
                                                                                                    .operationType(
                                                                                                        PublicBoolPropertyOperation
                                                                                                            .OperationType
                                                                                                            .BOOL
                                                                                                    )
                                                                                                    .operator(
                                                                                                        "operator"
                                                                                                    )
                                                                                                    .value(
                                                                                                        true
                                                                                                    )
                                                                                                    .build()
                                                                                            )
                                                                                            .property(
                                                                                                "property"
                                                                                            )
                                                                                            .build()
                                                                                    )
                                                                                    .objectTypeId(
                                                                                        "objectTypeId"
                                                                                    )
                                                                                    .operator(
                                                                                        "operator"
                                                                                    )
                                                                                    .build()
                                                                            )
                                                                            .filterBranchOperator(
                                                                                "filterBranchOperator"
                                                                            )
                                                                            .filterBranchType(
                                                                                PublicPropertyAssociationFilterBranch
                                                                                    .FilterBranchType
                                                                                    .PROPERTY_ASSOCIATION
                                                                            )
                                                                            .addFilter(
                                                                                PublicPropertyFilter
                                                                                    .builder()
                                                                                    .filterType(
                                                                                        PublicPropertyFilter
                                                                                            .FilterType
                                                                                            .PROPERTY
                                                                                    )
                                                                                    .operation(
                                                                                        PublicBoolPropertyOperation
                                                                                            .builder()
                                                                                            .includeObjectsWithNoValueSet(
                                                                                                true
                                                                                            )
                                                                                            .operationType(
                                                                                                PublicBoolPropertyOperation
                                                                                                    .OperationType
                                                                                                    .BOOL
                                                                                            )
                                                                                            .operator(
                                                                                                "operator"
                                                                                            )
                                                                                            .value(
                                                                                                true
                                                                                            )
                                                                                            .build()
                                                                                    )
                                                                                    .property(
                                                                                        "property"
                                                                                    )
                                                                                    .build()
                                                                            )
                                                                            .objectTypeId(
                                                                                "objectTypeId"
                                                                            )
                                                                            .operator("operator")
                                                                            .propertyWithObjectId(
                                                                                "propertyWithObjectId"
                                                                            )
                                                                            .build()
                                                                    )
                                                                    .filterBranchOperator(
                                                                        "filterBranchOperator"
                                                                    )
                                                                    .filterBranchType(
                                                                        PublicUnifiedEventsFilterBranch
                                                                            .FilterBranchType
                                                                            .UNIFIED_EVENTS
                                                                    )
                                                                    .addFilter(
                                                                        PublicPropertyFilter
                                                                            .builder()
                                                                            .filterType(
                                                                                PublicPropertyFilter
                                                                                    .FilterType
                                                                                    .PROPERTY
                                                                            )
                                                                            .operation(
                                                                                PublicBoolPropertyOperation
                                                                                    .builder()
                                                                                    .includeObjectsWithNoValueSet(
                                                                                        true
                                                                                    )
                                                                                    .operationType(
                                                                                        PublicBoolPropertyOperation
                                                                                            .OperationType
                                                                                            .BOOL
                                                                                    )
                                                                                    .operator(
                                                                                        "operator"
                                                                                    )
                                                                                    .value(true)
                                                                                    .build()
                                                                            )
                                                                            .property("property")
                                                                            .build()
                                                                    )
                                                                    .operator(
                                                                        PublicUnifiedEventsFilterBranch
                                                                            .Operator
                                                                            .HAS_COMPLETED
                                                                    )
                                                                    .coalescingRefineBy(
                                                                        PublicNumOccurrencesRefineBy
                                                                            .builder()
                                                                            .type(
                                                                                PublicNumOccurrencesRefineBy
                                                                                    .Type
                                                                                    .NUM_OCCURRENCES
                                                                            )
                                                                            .maxOccurrences(0)
                                                                            .minOccurrences(0)
                                                                            .build()
                                                                    )
                                                                    .pruningRefineBy(
                                                                        PublicNumOccurrencesRefineBy
                                                                            .builder()
                                                                            .type(
                                                                                PublicNumOccurrencesRefineBy
                                                                                    .Type
                                                                                    .NUM_OCCURRENCES
                                                                            )
                                                                            .maxOccurrences(0)
                                                                            .minOccurrences(0)
                                                                            .build()
                                                                    )
                                                                    .build()
                                                            )
                                                            .filterBranchOperator(
                                                                "filterBranchOperator"
                                                            )
                                                            .filterBranchType(
                                                                PublicRestrictedFilterBranch
                                                                    .FilterBranchType
                                                                    .RESTRICTED
                                                            )
                                                            .addFilter(
                                                                PublicPropertyFilter.builder()
                                                                    .filterType(
                                                                        PublicPropertyFilter
                                                                            .FilterType
                                                                            .PROPERTY
                                                                    )
                                                                    .operation(
                                                                        PublicBoolPropertyOperation
                                                                            .builder()
                                                                            .includeObjectsWithNoValueSet(
                                                                                true
                                                                            )
                                                                            .operationType(
                                                                                PublicBoolPropertyOperation
                                                                                    .OperationType
                                                                                    .BOOL
                                                                            )
                                                                            .operator("operator")
                                                                            .value(true)
                                                                            .build()
                                                                    )
                                                                    .property("property")
                                                                    .build()
                                                            )
                                                            .build()
                                                    )
                                                    .filterBranchOperator("filterBranchOperator")
                                                    .filterBranchType(
                                                        PublicNotAnyFilterBranch.FilterBranchType
                                                            .NOT_ANY
                                                    )
                                                    .addFilter(
                                                        PublicPropertyFilter.builder()
                                                            .filterType(
                                                                PublicPropertyFilter.FilterType
                                                                    .PROPERTY
                                                            )
                                                            .operation(
                                                                PublicBoolPropertyOperation
                                                                    .builder()
                                                                    .includeObjectsWithNoValueSet(
                                                                        true
                                                                    )
                                                                    .operationType(
                                                                        PublicBoolPropertyOperation
                                                                            .OperationType
                                                                            .BOOL
                                                                    )
                                                                    .operator("operator")
                                                                    .value(true)
                                                                    .build()
                                                            )
                                                            .property("property")
                                                            .build()
                                                    )
                                                    .build()
                                            )
                                            .filterBranchOperator("filterBranchOperator")
                                            .filterBranchType(
                                                PublicNotAllFilterBranch.FilterBranchType.NOT_ALL
                                            )
                                            .addFilter(
                                                PublicPropertyFilter.builder()
                                                    .filterType(
                                                        PublicPropertyFilter.FilterType.PROPERTY
                                                    )
                                                    .operation(
                                                        PublicBoolPropertyOperation.builder()
                                                            .includeObjectsWithNoValueSet(true)
                                                            .operationType(
                                                                PublicBoolPropertyOperation
                                                                    .OperationType
                                                                    .BOOL
                                                            )
                                                            .operator("operator")
                                                            .value(true)
                                                            .build()
                                                    )
                                                    .property("property")
                                                    .build()
                                            )
                                            .build()
                                    )
                                    .filterBranchOperator("filterBranchOperator")
                                    .filterBranchType(PublicAndFilterBranch.FilterBranchType.AND)
                                    .addFilter(
                                        PublicPropertyFilter.builder()
                                            .filterType(PublicPropertyFilter.FilterType.PROPERTY)
                                            .operation(
                                                PublicBoolPropertyOperation.builder()
                                                    .includeObjectsWithNoValueSet(true)
                                                    .operationType(
                                                        PublicBoolPropertyOperation.OperationType
                                                            .BOOL
                                                    )
                                                    .operator("operator")
                                                    .value(true)
                                                    .build()
                                            )
                                            .property("property")
                                            .build()
                                    )
                                    .build()
                            )
                            .filterBranchOperator("filterBranchOperator")
                            .filterBranchType(PublicOrFilterBranch.FilterBranchType.OR)
                            .addFilter(
                                PublicPropertyFilter.builder()
                                    .filterType(PublicPropertyFilter.FilterType.PROPERTY)
                                    .operation(
                                        PublicBoolPropertyOperation.builder()
                                            .includeObjectsWithNoValueSet(true)
                                            .operationType(
                                                PublicBoolPropertyOperation.OperationType.BOOL
                                            )
                                            .operator("operator")
                                            .value(true)
                                            .build()
                                    )
                                    .property("property")
                                    .build()
                            )
                            .build()
                    )
                    .listFolderId(0)
                    .listPermissions(
                        PublicListPermissions.builder()
                            .addTeamsWithEditAccess(0)
                            .addUsersWithEditAccess(0)
                            .build()
                    )
                    .membershipSettings(
                        PublicMembershipSettings.builder()
                            .includeUnassigned(true)
                            .membershipTeamId(0)
                            .build()
                    )
                    .build()
            )

        listCreateResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val listService = client.crm().lists()

        val listsByIdResponse =
            listService.list(
                ListListParams.builder().includeFilters(true).addListId("string").build()
            )

        listsByIdResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val listService = client.crm().lists()

        listService.delete("listId")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun addAndRemoveMemberships() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val listService = client.crm().lists()

        val membershipsUpdateResponse =
            listService.addAndRemoveMemberships(
                ListAddAndRemoveMembershipsParams.builder()
                    .listId("listId")
                    .membershipChangeRequest(
                        MembershipChangeRequest.builder()
                            .addRecordIdsToAdd("string")
                            .addRecordIdsToRemove("string")
                            .build()
                    )
                    .build()
            )

        membershipsUpdateResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun addMemberships() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val listService = client.crm().lists()

        val membershipsUpdateResponse =
            listService.addMemberships(
                ListAddMembershipsParams.builder().listId("listId").addBody("string").build()
            )

        membershipsUpdateResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun addMembershipsFrom() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val listService = client.crm().lists()

        listService.addMembershipsFrom(
            ListAddMembershipsFromParams.builder()
                .listId("listId")
                .sourceListId("sourceListId")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun batchReadMemberships() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val listService = client.crm().lists()

        val batchResponseRecordIdWithMemberships =
            listService.batchReadMemberships(
                BatchInputRecordIdInput.builder()
                    .addInput(
                        RecordIdInput.builder()
                            .objectTypeId("objectTypeId")
                            .recordId("recordId")
                            .build()
                    )
                    .build()
            )

        batchResponseRecordIdWithMemberships.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createFolder() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val listService = client.crm().lists()

        val listFolderCreateResponse =
            listService.createFolder(
                ListFolderCreateRequest.builder()
                    .name("name")
                    .parentFolderId("parentFolderId")
                    .build()
            )

        listFolderCreateResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createIdMapping() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val listService = client.crm().lists()

        val publicBatchMigrationMapping = listService.createIdMapping(listOf("string"))

        publicBatchMigrationMapping.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteFolder() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val listService = client.crm().lists()

        listService.deleteFolder("folderId")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteMemberships() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val listService = client.crm().lists()

        listService.deleteMemberships("listId")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val listService = client.crm().lists()

        val listFetchResponse =
            listService.get(ListGetParams.builder().listId("listId").includeFilters(true).build())

        listFetchResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getByObjectTypeAndName() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val listService = client.crm().lists()

        val listFetchResponse =
            listService.getByObjectTypeAndName(
                ListGetByObjectTypeAndNameParams.builder()
                    .objectTypeId("objectTypeId")
                    .listName("listName")
                    .includeFilters(true)
                    .build()
            )

        listFetchResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getIdMapping() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val listService = client.crm().lists()

        val publicMigrationMapping =
            listService.getIdMapping(
                ListGetIdMappingParams.builder().legacyListId("legacyListId").build()
            )

        publicMigrationMapping.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getMembershipsJoinOrder() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val listService = client.crm().lists()

        val page = listService.getMembershipsJoinOrder("listId")

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getRecordMemberships() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val listService = client.crm().lists()

        val apiCollectionResponseRecordListMembership =
            listService.getRecordMemberships(
                ListGetRecordMembershipsParams.builder()
                    .objectTypeId("objectTypeId")
                    .recordId("recordId")
                    .build()
            )

        apiCollectionResponseRecordListMembership.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getScheduleConversion() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val listService = client.crm().lists()

        val publicListConversionResponse = listService.getScheduleConversion("listId")

        publicListConversionResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getSizeAndEditsHistoryBetween() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val listService = client.crm().lists()

        val listSizeAndEditHistoryResponse =
            listService.getSizeAndEditsHistoryBetween(
                ListGetSizeAndEditsHistoryBetweenParams.builder()
                    .listId("listId")
                    .endDate("endDate")
                    .startDate("startDate")
                    .build()
            )

        listSizeAndEditHistoryResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listBySearch() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val listService = client.crm().lists()

        val listSearchResponse =
            listService.listBySearch(
                ListSearchRequest.builder()
                    .addListId("string")
                    .offset(0)
                    .addProcessingType("string")
                    .addAdditionalFilterProperty("string")
                    .count(0)
                    .objectTypeId("objectTypeId")
                    .query("query")
                    .sort("sort")
                    .build()
            )

        listSearchResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listFolders() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val listService = client.crm().lists()

        val listFolderFetchResponse =
            listService.listFolders(ListListFoldersParams.builder().folderId("folderId").build())

        listFolderFetchResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listMemberships() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val listService = client.crm().lists()

        val page = listService.listMemberships("listId")

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun moveFolder() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val listService = client.crm().lists()

        val listFolderFetchResponse =
            listService.moveFolder(
                ListMoveFolderParams.builder()
                    .folderId("folderId")
                    .newParentFolderId("newParentFolderId")
                    .build()
            )

        listFolderFetchResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun moveList() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val listService = client.crm().lists()

        listService.moveList(
            ListMoveRequest.builder().listId("listId").newFolderId("newFolderId").build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun removeMemberships() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val listService = client.crm().lists()

        val membershipsUpdateResponse =
            listService.removeMemberships(
                ListRemoveMembershipsParams.builder().listId("listId").addBody("string").build()
            )

        membershipsUpdateResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun renameFolder() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val listService = client.crm().lists()

        val listFolderFetchResponse =
            listService.renameFolder(
                ListRenameFolderParams.builder()
                    .folderId("folderId")
                    .newFolderName("newFolderName")
                    .build()
            )

        listFolderFetchResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun restore() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val listService = client.crm().lists()

        listService.restore("listId")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun scheduleConversion() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val listService = client.crm().lists()

        listService.scheduleConversion("listId")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateListFilters() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val listService = client.crm().lists()

        val listUpdateResponse =
            listService.updateListFilters(
                ListUpdateListFiltersParams.builder()
                    .listId("listId")
                    .enrollObjectsInWorkflows(true)
                    .listFilterUpdateRequest(
                        ListFilterUpdateRequest.builder()
                            .filterBranch(
                                PublicOrFilterBranch.builder()
                                    .addFilterBranch(
                                        PublicAndFilterBranch.builder()
                                            .addFilterBranch(
                                                PublicNotAllFilterBranch.builder()
                                                    .addFilterBranch(
                                                        PublicNotAnyFilterBranch.builder()
                                                            .addFilterBranch(
                                                                PublicRestrictedFilterBranch
                                                                    .builder()
                                                                    .addFilterBranch(
                                                                        PublicUnifiedEventsFilterBranch
                                                                            .builder()
                                                                            .eventTypeId(
                                                                                "eventTypeId"
                                                                            )
                                                                            .addFilterBranch(
                                                                                PublicPropertyAssociationFilterBranch
                                                                                    .builder()
                                                                                    .addFilterBranch(
                                                                                        PublicAssociationFilterBranch
                                                                                            .builder()
                                                                                            .associationCategory(
                                                                                                "associationCategory"
                                                                                            )
                                                                                            .associationTypeId(
                                                                                                0
                                                                                            )
                                                                                            .addFilterBranch(
                                                                                                PublicOrFilterBranch
                                                                                                    .builder()
                                                                                                    .filterBranches(
                                                                                                        listOf()
                                                                                                    )
                                                                                                    .filterBranchOperator(
                                                                                                        "filterBranchOperator"
                                                                                                    )
                                                                                                    .filterBranchType(
                                                                                                        PublicOrFilterBranch
                                                                                                            .FilterBranchType
                                                                                                            .OR
                                                                                                    )
                                                                                                    .addFilter(
                                                                                                        PublicPropertyFilter
                                                                                                            .builder()
                                                                                                            .filterType(
                                                                                                                PublicPropertyFilter
                                                                                                                    .FilterType
                                                                                                                    .PROPERTY
                                                                                                            )
                                                                                                            .operation(
                                                                                                                PublicBoolPropertyOperation
                                                                                                                    .builder()
                                                                                                                    .includeObjectsWithNoValueSet(
                                                                                                                        true
                                                                                                                    )
                                                                                                                    .operationType(
                                                                                                                        PublicBoolPropertyOperation
                                                                                                                            .OperationType
                                                                                                                            .BOOL
                                                                                                                    )
                                                                                                                    .operator(
                                                                                                                        "operator"
                                                                                                                    )
                                                                                                                    .value(
                                                                                                                        true
                                                                                                                    )
                                                                                                                    .build()
                                                                                                            )
                                                                                                            .property(
                                                                                                                "property"
                                                                                                            )
                                                                                                            .build()
                                                                                                    )
                                                                                                    .build()
                                                                                            )
                                                                                            .filterBranchOperator(
                                                                                                "filterBranchOperator"
                                                                                            )
                                                                                            .filterBranchType(
                                                                                                PublicAssociationFilterBranch
                                                                                                    .FilterBranchType
                                                                                                    .ASSOCIATION
                                                                                            )
                                                                                            .addFilter(
                                                                                                PublicPropertyFilter
                                                                                                    .builder()
                                                                                                    .filterType(
                                                                                                        PublicPropertyFilter
                                                                                                            .FilterType
                                                                                                            .PROPERTY
                                                                                                    )
                                                                                                    .operation(
                                                                                                        PublicBoolPropertyOperation
                                                                                                            .builder()
                                                                                                            .includeObjectsWithNoValueSet(
                                                                                                                true
                                                                                                            )
                                                                                                            .operationType(
                                                                                                                PublicBoolPropertyOperation
                                                                                                                    .OperationType
                                                                                                                    .BOOL
                                                                                                            )
                                                                                                            .operator(
                                                                                                                "operator"
                                                                                                            )
                                                                                                            .value(
                                                                                                                true
                                                                                                            )
                                                                                                            .build()
                                                                                                    )
                                                                                                    .property(
                                                                                                        "property"
                                                                                                    )
                                                                                                    .build()
                                                                                            )
                                                                                            .objectTypeId(
                                                                                                "objectTypeId"
                                                                                            )
                                                                                            .operator(
                                                                                                "operator"
                                                                                            )
                                                                                            .build()
                                                                                    )
                                                                                    .filterBranchOperator(
                                                                                        "filterBranchOperator"
                                                                                    )
                                                                                    .filterBranchType(
                                                                                        PublicPropertyAssociationFilterBranch
                                                                                            .FilterBranchType
                                                                                            .PROPERTY_ASSOCIATION
                                                                                    )
                                                                                    .addFilter(
                                                                                        PublicPropertyFilter
                                                                                            .builder()
                                                                                            .filterType(
                                                                                                PublicPropertyFilter
                                                                                                    .FilterType
                                                                                                    .PROPERTY
                                                                                            )
                                                                                            .operation(
                                                                                                PublicBoolPropertyOperation
                                                                                                    .builder()
                                                                                                    .includeObjectsWithNoValueSet(
                                                                                                        true
                                                                                                    )
                                                                                                    .operationType(
                                                                                                        PublicBoolPropertyOperation
                                                                                                            .OperationType
                                                                                                            .BOOL
                                                                                                    )
                                                                                                    .operator(
                                                                                                        "operator"
                                                                                                    )
                                                                                                    .value(
                                                                                                        true
                                                                                                    )
                                                                                                    .build()
                                                                                            )
                                                                                            .property(
                                                                                                "property"
                                                                                            )
                                                                                            .build()
                                                                                    )
                                                                                    .objectTypeId(
                                                                                        "objectTypeId"
                                                                                    )
                                                                                    .operator(
                                                                                        "operator"
                                                                                    )
                                                                                    .propertyWithObjectId(
                                                                                        "propertyWithObjectId"
                                                                                    )
                                                                                    .build()
                                                                            )
                                                                            .filterBranchOperator(
                                                                                "filterBranchOperator"
                                                                            )
                                                                            .filterBranchType(
                                                                                PublicUnifiedEventsFilterBranch
                                                                                    .FilterBranchType
                                                                                    .UNIFIED_EVENTS
                                                                            )
                                                                            .addFilter(
                                                                                PublicPropertyFilter
                                                                                    .builder()
                                                                                    .filterType(
                                                                                        PublicPropertyFilter
                                                                                            .FilterType
                                                                                            .PROPERTY
                                                                                    )
                                                                                    .operation(
                                                                                        PublicBoolPropertyOperation
                                                                                            .builder()
                                                                                            .includeObjectsWithNoValueSet(
                                                                                                true
                                                                                            )
                                                                                            .operationType(
                                                                                                PublicBoolPropertyOperation
                                                                                                    .OperationType
                                                                                                    .BOOL
                                                                                            )
                                                                                            .operator(
                                                                                                "operator"
                                                                                            )
                                                                                            .value(
                                                                                                true
                                                                                            )
                                                                                            .build()
                                                                                    )
                                                                                    .property(
                                                                                        "property"
                                                                                    )
                                                                                    .build()
                                                                            )
                                                                            .operator(
                                                                                PublicUnifiedEventsFilterBranch
                                                                                    .Operator
                                                                                    .HAS_COMPLETED
                                                                            )
                                                                            .coalescingRefineBy(
                                                                                PublicNumOccurrencesRefineBy
                                                                                    .builder()
                                                                                    .type(
                                                                                        PublicNumOccurrencesRefineBy
                                                                                            .Type
                                                                                            .NUM_OCCURRENCES
                                                                                    )
                                                                                    .maxOccurrences(
                                                                                        0
                                                                                    )
                                                                                    .minOccurrences(
                                                                                        0
                                                                                    )
                                                                                    .build()
                                                                            )
                                                                            .pruningRefineBy(
                                                                                PublicNumOccurrencesRefineBy
                                                                                    .builder()
                                                                                    .type(
                                                                                        PublicNumOccurrencesRefineBy
                                                                                            .Type
                                                                                            .NUM_OCCURRENCES
                                                                                    )
                                                                                    .maxOccurrences(
                                                                                        0
                                                                                    )
                                                                                    .minOccurrences(
                                                                                        0
                                                                                    )
                                                                                    .build()
                                                                            )
                                                                            .build()
                                                                    )
                                                                    .filterBranchOperator(
                                                                        "filterBranchOperator"
                                                                    )
                                                                    .filterBranchType(
                                                                        PublicRestrictedFilterBranch
                                                                            .FilterBranchType
                                                                            .RESTRICTED
                                                                    )
                                                                    .addFilter(
                                                                        PublicPropertyFilter
                                                                            .builder()
                                                                            .filterType(
                                                                                PublicPropertyFilter
                                                                                    .FilterType
                                                                                    .PROPERTY
                                                                            )
                                                                            .operation(
                                                                                PublicBoolPropertyOperation
                                                                                    .builder()
                                                                                    .includeObjectsWithNoValueSet(
                                                                                        true
                                                                                    )
                                                                                    .operationType(
                                                                                        PublicBoolPropertyOperation
                                                                                            .OperationType
                                                                                            .BOOL
                                                                                    )
                                                                                    .operator(
                                                                                        "operator"
                                                                                    )
                                                                                    .value(true)
                                                                                    .build()
                                                                            )
                                                                            .property("property")
                                                                            .build()
                                                                    )
                                                                    .build()
                                                            )
                                                            .filterBranchOperator(
                                                                "filterBranchOperator"
                                                            )
                                                            .filterBranchType(
                                                                PublicNotAnyFilterBranch
                                                                    .FilterBranchType
                                                                    .NOT_ANY
                                                            )
                                                            .addFilter(
                                                                PublicPropertyFilter.builder()
                                                                    .filterType(
                                                                        PublicPropertyFilter
                                                                            .FilterType
                                                                            .PROPERTY
                                                                    )
                                                                    .operation(
                                                                        PublicBoolPropertyOperation
                                                                            .builder()
                                                                            .includeObjectsWithNoValueSet(
                                                                                true
                                                                            )
                                                                            .operationType(
                                                                                PublicBoolPropertyOperation
                                                                                    .OperationType
                                                                                    .BOOL
                                                                            )
                                                                            .operator("operator")
                                                                            .value(true)
                                                                            .build()
                                                                    )
                                                                    .property("property")
                                                                    .build()
                                                            )
                                                            .build()
                                                    )
                                                    .filterBranchOperator("filterBranchOperator")
                                                    .filterBranchType(
                                                        PublicNotAllFilterBranch.FilterBranchType
                                                            .NOT_ALL
                                                    )
                                                    .addFilter(
                                                        PublicPropertyFilter.builder()
                                                            .filterType(
                                                                PublicPropertyFilter.FilterType
                                                                    .PROPERTY
                                                            )
                                                            .operation(
                                                                PublicBoolPropertyOperation
                                                                    .builder()
                                                                    .includeObjectsWithNoValueSet(
                                                                        true
                                                                    )
                                                                    .operationType(
                                                                        PublicBoolPropertyOperation
                                                                            .OperationType
                                                                            .BOOL
                                                                    )
                                                                    .operator("operator")
                                                                    .value(true)
                                                                    .build()
                                                            )
                                                            .property("property")
                                                            .build()
                                                    )
                                                    .build()
                                            )
                                            .filterBranchOperator("filterBranchOperator")
                                            .filterBranchType(
                                                PublicAndFilterBranch.FilterBranchType.AND
                                            )
                                            .addFilter(
                                                PublicPropertyFilter.builder()
                                                    .filterType(
                                                        PublicPropertyFilter.FilterType.PROPERTY
                                                    )
                                                    .operation(
                                                        PublicBoolPropertyOperation.builder()
                                                            .includeObjectsWithNoValueSet(true)
                                                            .operationType(
                                                                PublicBoolPropertyOperation
                                                                    .OperationType
                                                                    .BOOL
                                                            )
                                                            .operator("operator")
                                                            .value(true)
                                                            .build()
                                                    )
                                                    .property("property")
                                                    .build()
                                            )
                                            .build()
                                    )
                                    .filterBranchOperator("filterBranchOperator")
                                    .filterBranchType(PublicOrFilterBranch.FilterBranchType.OR)
                                    .addFilter(
                                        PublicPropertyFilter.builder()
                                            .filterType(PublicPropertyFilter.FilterType.PROPERTY)
                                            .operation(
                                                PublicBoolPropertyOperation.builder()
                                                    .includeObjectsWithNoValueSet(true)
                                                    .operationType(
                                                        PublicBoolPropertyOperation.OperationType
                                                            .BOOL
                                                    )
                                                    .operator("operator")
                                                    .value(true)
                                                    .build()
                                            )
                                            .property("property")
                                            .build()
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        listUpdateResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateListName() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val listService = client.crm().lists()

        val listUpdateResponse =
            listService.updateListName(
                ListUpdateListNameParams.builder()
                    .listId("listId")
                    .includeFilters(true)
                    .listName("listName")
                    .build()
            )

        listUpdateResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateScheduleConversion() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val listService = client.crm().lists()

        val publicListConversionResponse =
            listService.updateScheduleConversion(
                ListUpdateScheduleConversionParams.builder()
                    .listId("listId")
                    .publicListConversionTime(
                        PublicListConversionDate.builder()
                            .conversionType(PublicListConversionDate.ConversionType.CONVERSION_DATE)
                            .day(0)
                            .month(0)
                            .year(0)
                            .build()
                    )
                    .build()
            )

        publicListConversionResponse.validate()
    }
}
