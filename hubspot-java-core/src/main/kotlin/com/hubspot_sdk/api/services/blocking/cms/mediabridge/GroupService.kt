// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.cms.mediabridge

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.cms.mediabridge.groups.GroupCreateParams
import com.hubspot_sdk.api.models.cms.mediabridge.groups.GroupDeleteByNameParams
import com.hubspot_sdk.api.models.cms.mediabridge.groups.GroupGetByNameParams
import com.hubspot_sdk.api.models.cms.mediabridge.groups.GroupListParams
import com.hubspot_sdk.api.models.cms.mediabridge.groups.GroupListResponse
import com.hubspot_sdk.api.models.cms.mediabridge.groups.GroupUpdateByNameParams
import com.hubspot_sdk.api.models.crm.properties.PropertyGroup
import java.util.function.Consumer

interface GroupService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GroupService

    /** Create a new property group for the specified object type. */
    fun create(objectType: String, params: GroupCreateParams): PropertyGroup =
        create(objectType, params, RequestOptions.none())

    /** @see create */
    fun create(
        objectType: String,
        params: GroupCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PropertyGroup = create(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see create */
    fun create(params: GroupCreateParams): PropertyGroup = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: GroupCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PropertyGroup

    /** Get the property groups for a specified object type. */
    fun list(objectType: String, params: GroupListParams): GroupListResponse =
        list(objectType, params, RequestOptions.none())

    /** @see list */
    fun list(
        objectType: String,
        params: GroupListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GroupListResponse = list(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see list */
    fun list(params: GroupListParams): GroupListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: GroupListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GroupListResponse

    /** Delete an existing property group by name */
    fun deleteByName(groupName: String, params: GroupDeleteByNameParams) =
        deleteByName(groupName, params, RequestOptions.none())

    /** @see deleteByName */
    fun deleteByName(
        groupName: String,
        params: GroupDeleteByNameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = deleteByName(params.toBuilder().groupName(groupName).build(), requestOptions)

    /** @see deleteByName */
    fun deleteByName(params: GroupDeleteByNameParams) = deleteByName(params, RequestOptions.none())

    /** @see deleteByName */
    fun deleteByName(
        params: GroupDeleteByNameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Get the details of an existing property group by name. */
    fun getByName(groupName: String, params: GroupGetByNameParams): PropertyGroup =
        getByName(groupName, params, RequestOptions.none())

    /** @see getByName */
    fun getByName(
        groupName: String,
        params: GroupGetByNameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PropertyGroup = getByName(params.toBuilder().groupName(groupName).build(), requestOptions)

    /** @see getByName */
    fun getByName(params: GroupGetByNameParams): PropertyGroup =
        getByName(params, RequestOptions.none())

    /** @see getByName */
    fun getByName(
        params: GroupGetByNameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PropertyGroup

    /** Update an existing property group by name. */
    fun updateByName(groupName: String, params: GroupUpdateByNameParams): PropertyGroup =
        updateByName(groupName, params, RequestOptions.none())

    /** @see updateByName */
    fun updateByName(
        groupName: String,
        params: GroupUpdateByNameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PropertyGroup = updateByName(params.toBuilder().groupName(groupName).build(), requestOptions)

    /** @see updateByName */
    fun updateByName(params: GroupUpdateByNameParams): PropertyGroup =
        updateByName(params, RequestOptions.none())

    /** @see updateByName */
    fun updateByName(
        params: GroupUpdateByNameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PropertyGroup

    /** A view of [GroupService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): GroupService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /media-bridge/v1/{appId}/properties/{objectType}/groups`, but is otherwise the same as
         * [GroupService.create].
         */
        @MustBeClosed
        fun create(objectType: String, params: GroupCreateParams): HttpResponseFor<PropertyGroup> =
            create(objectType, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            objectType: String,
            params: GroupCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PropertyGroup> =
            create(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: GroupCreateParams): HttpResponseFor<PropertyGroup> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: GroupCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PropertyGroup>

        /**
         * Returns a raw HTTP response for `get
         * /media-bridge/v1/{appId}/properties/{objectType}/groups`, but is otherwise the same as
         * [GroupService.list].
         */
        @MustBeClosed
        fun list(objectType: String, params: GroupListParams): HttpResponseFor<GroupListResponse> =
            list(objectType, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            objectType: String,
            params: GroupListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GroupListResponse> =
            list(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(params: GroupListParams): HttpResponseFor<GroupListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: GroupListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GroupListResponse>

        /**
         * Returns a raw HTTP response for `delete
         * /media-bridge/v1/{appId}/properties/{objectType}/groups/{groupName}`, but is otherwise
         * the same as [GroupService.deleteByName].
         */
        @MustBeClosed
        fun deleteByName(groupName: String, params: GroupDeleteByNameParams): HttpResponse =
            deleteByName(groupName, params, RequestOptions.none())

        /** @see deleteByName */
        @MustBeClosed
        fun deleteByName(
            groupName: String,
            params: GroupDeleteByNameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deleteByName(params.toBuilder().groupName(groupName).build(), requestOptions)

        /** @see deleteByName */
        @MustBeClosed
        fun deleteByName(params: GroupDeleteByNameParams): HttpResponse =
            deleteByName(params, RequestOptions.none())

        /** @see deleteByName */
        @MustBeClosed
        fun deleteByName(
            params: GroupDeleteByNameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get
         * /media-bridge/v1/{appId}/properties/{objectType}/groups/{groupName}`, but is otherwise
         * the same as [GroupService.getByName].
         */
        @MustBeClosed
        fun getByName(
            groupName: String,
            params: GroupGetByNameParams,
        ): HttpResponseFor<PropertyGroup> = getByName(groupName, params, RequestOptions.none())

        /** @see getByName */
        @MustBeClosed
        fun getByName(
            groupName: String,
            params: GroupGetByNameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PropertyGroup> =
            getByName(params.toBuilder().groupName(groupName).build(), requestOptions)

        /** @see getByName */
        @MustBeClosed
        fun getByName(params: GroupGetByNameParams): HttpResponseFor<PropertyGroup> =
            getByName(params, RequestOptions.none())

        /** @see getByName */
        @MustBeClosed
        fun getByName(
            params: GroupGetByNameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PropertyGroup>

        /**
         * Returns a raw HTTP response for `patch
         * /media-bridge/v1/{appId}/properties/{objectType}/groups/{groupName}`, but is otherwise
         * the same as [GroupService.updateByName].
         */
        @MustBeClosed
        fun updateByName(
            groupName: String,
            params: GroupUpdateByNameParams,
        ): HttpResponseFor<PropertyGroup> = updateByName(groupName, params, RequestOptions.none())

        /** @see updateByName */
        @MustBeClosed
        fun updateByName(
            groupName: String,
            params: GroupUpdateByNameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PropertyGroup> =
            updateByName(params.toBuilder().groupName(groupName).build(), requestOptions)

        /** @see updateByName */
        @MustBeClosed
        fun updateByName(params: GroupUpdateByNameParams): HttpResponseFor<PropertyGroup> =
            updateByName(params, RequestOptions.none())

        /** @see updateByName */
        @MustBeClosed
        fun updateByName(
            params: GroupUpdateByNameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PropertyGroup>
    }
}
