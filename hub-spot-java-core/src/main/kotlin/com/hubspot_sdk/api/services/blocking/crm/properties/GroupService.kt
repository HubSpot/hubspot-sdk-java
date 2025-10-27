// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.properties

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.properties.CollectionResponsePropertyGroup
import com.hubspot_sdk.api.models.crm.properties.CreatedResponsePropertyGroup
import com.hubspot_sdk.api.models.crm.properties.PropertyGroup
import com.hubspot_sdk.api.models.crm.properties.groups.GroupCreateParams
import com.hubspot_sdk.api.models.crm.properties.groups.GroupDeleteParams
import com.hubspot_sdk.api.models.crm.properties.groups.GroupGetParams
import com.hubspot_sdk.api.models.crm.properties.groups.GroupListParams
import com.hubspot_sdk.api.models.crm.properties.groups.GroupUpdateParams
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

    /** Create and return a copy of a new property group. */
    fun create(objectType: String, params: GroupCreateParams): CreatedResponsePropertyGroup =
        create(objectType, params, RequestOptions.none())

    /** @see create */
    fun create(
        objectType: String,
        params: GroupCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreatedResponsePropertyGroup =
        create(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see create */
    fun create(params: GroupCreateParams): CreatedResponsePropertyGroup =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: GroupCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreatedResponsePropertyGroup

    /**
     * Perform a partial update of a property group identified by {groupName}. Provided fields will
     * be overwritten.
     */
    fun update(groupName: String, params: GroupUpdateParams): PropertyGroup =
        update(groupName, params, RequestOptions.none())

    /** @see update */
    fun update(
        groupName: String,
        params: GroupUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PropertyGroup = update(params.toBuilder().groupName(groupName).build(), requestOptions)

    /** @see update */
    fun update(params: GroupUpdateParams): PropertyGroup = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: GroupUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PropertyGroup

    /** Read all existing property groups for the specified object type and HubSpot account. */
    fun list(objectType: String): CollectionResponsePropertyGroup =
        list(objectType, GroupListParams.none())

    /** @see list */
    fun list(
        objectType: String,
        params: GroupListParams = GroupListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponsePropertyGroup =
        list(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see list */
    fun list(
        objectType: String,
        params: GroupListParams = GroupListParams.none(),
    ): CollectionResponsePropertyGroup = list(objectType, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: GroupListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponsePropertyGroup

    /** @see list */
    fun list(params: GroupListParams): CollectionResponsePropertyGroup =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(objectType: String, requestOptions: RequestOptions): CollectionResponsePropertyGroup =
        list(objectType, GroupListParams.none(), requestOptions)

    /** Move a property group identified by {groupName} to the recycling bin. */
    fun delete(groupName: String, params: GroupDeleteParams) =
        delete(groupName, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        groupName: String,
        params: GroupDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().groupName(groupName).build(), requestOptions)

    /** @see delete */
    fun delete(params: GroupDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(params: GroupDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Read a property group identified by {groupName}. */
    fun get(groupName: String, params: GroupGetParams): PropertyGroup =
        get(groupName, params, RequestOptions.none())

    /** @see get */
    fun get(
        groupName: String,
        params: GroupGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PropertyGroup = get(params.toBuilder().groupName(groupName).build(), requestOptions)

    /** @see get */
    fun get(params: GroupGetParams): PropertyGroup = get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: GroupGetParams,
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
         * Returns a raw HTTP response for `post /crm/v3/properties/{objectType}/groups`, but is
         * otherwise the same as [GroupService.create].
         */
        @MustBeClosed
        fun create(
            objectType: String,
            params: GroupCreateParams,
        ): HttpResponseFor<CreatedResponsePropertyGroup> =
            create(objectType, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            objectType: String,
            params: GroupCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreatedResponsePropertyGroup> =
            create(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: GroupCreateParams): HttpResponseFor<CreatedResponsePropertyGroup> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: GroupCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreatedResponsePropertyGroup>

        /**
         * Returns a raw HTTP response for `patch
         * /crm/v3/properties/{objectType}/groups/{groupName}`, but is otherwise the same as
         * [GroupService.update].
         */
        @MustBeClosed
        fun update(groupName: String, params: GroupUpdateParams): HttpResponseFor<PropertyGroup> =
            update(groupName, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            groupName: String,
            params: GroupUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PropertyGroup> =
            update(params.toBuilder().groupName(groupName).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: GroupUpdateParams): HttpResponseFor<PropertyGroup> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: GroupUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PropertyGroup>

        /**
         * Returns a raw HTTP response for `get /crm/v3/properties/{objectType}/groups`, but is
         * otherwise the same as [GroupService.list].
         */
        @MustBeClosed
        fun list(objectType: String): HttpResponseFor<CollectionResponsePropertyGroup> =
            list(objectType, GroupListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            objectType: String,
            params: GroupListParams = GroupListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponsePropertyGroup> =
            list(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            objectType: String,
            params: GroupListParams = GroupListParams.none(),
        ): HttpResponseFor<CollectionResponsePropertyGroup> =
            list(objectType, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: GroupListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponsePropertyGroup>

        /** @see list */
        @MustBeClosed
        fun list(params: GroupListParams): HttpResponseFor<CollectionResponsePropertyGroup> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            objectType: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponsePropertyGroup> =
            list(objectType, GroupListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /crm/v3/properties/{objectType}/groups/{groupName}`, but is otherwise the same as
         * [GroupService.delete].
         */
        @MustBeClosed
        fun delete(groupName: String, params: GroupDeleteParams): HttpResponse =
            delete(groupName, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            groupName: String,
            params: GroupDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().groupName(groupName).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: GroupDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: GroupDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /crm/v3/properties/{objectType}/groups/{groupName}`,
         * but is otherwise the same as [GroupService.get].
         */
        @MustBeClosed
        fun get(groupName: String, params: GroupGetParams): HttpResponseFor<PropertyGroup> =
            get(groupName, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            groupName: String,
            params: GroupGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PropertyGroup> =
            get(params.toBuilder().groupName(groupName).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(params: GroupGetParams): HttpResponseFor<PropertyGroup> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: GroupGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PropertyGroup>
    }
}
