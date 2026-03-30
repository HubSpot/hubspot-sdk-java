// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.objects

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.CollectionResponseWithTotalSimplePublicObject
import com.hubspot_sdk.api.models.crm.PublicObjectSearchRequest
import com.hubspot_sdk.api.models.crm.SimplePublicObject
import com.hubspot_sdk.api.models.crm.objects.SimplePublicObjectInputForCreate
import com.hubspot_sdk.api.models.crm.objects.SimplePublicObjectWithAssociations
import com.hubspot_sdk.api.models.crm.objects.courses.CourseCreateParams
import com.hubspot_sdk.api.models.crm.objects.courses.CourseDeleteParams
import com.hubspot_sdk.api.models.crm.objects.courses.CourseGetParams
import com.hubspot_sdk.api.models.crm.objects.courses.CourseListPageAsync
import com.hubspot_sdk.api.models.crm.objects.courses.CourseListParams
import com.hubspot_sdk.api.models.crm.objects.courses.CourseSearchParams
import com.hubspot_sdk.api.models.crm.objects.courses.CourseUpdateParams
import com.hubspot_sdk.api.services.async.crm.objects.courses.BatchServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CourseServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CourseServiceAsync

    fun batch(): BatchServiceAsync

    /**
     * Create a course with the given properties and return a copy of the object, including the ID.
     * Documentation and examples for creating standard courses is provided.
     */
    fun create(params: CourseCreateParams): CompletableFuture<SimplePublicObject> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CourseCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject>

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject> =
        create(
            CourseCreateParams.builder()
                .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
    ): CompletableFuture<SimplePublicObject> =
        create(simplePublicObjectInputForCreate, RequestOptions.none())

    /**
     * Perform a partial update of an Object identified by `{courseId}`or optionally a unique
     * property value as specified by the `idProperty` query param. `{courseId}` refers to the
     * internal object ID by default, and the `idProperty` query param refers to a property whose
     * values are unique for the object. Provided property values will be overwritten. Read-only and
     * non-existent properties will result in an error. Properties values can be cleared by passing
     * an empty string.
     */
    fun update(
        courseId: String,
        params: CourseUpdateParams,
    ): CompletableFuture<SimplePublicObject> = update(courseId, params, RequestOptions.none())

    /** @see update */
    fun update(
        courseId: String,
        params: CourseUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject> =
        update(params.toBuilder().courseId(courseId).build(), requestOptions)

    /** @see update */
    fun update(params: CourseUpdateParams): CompletableFuture<SimplePublicObject> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CourseUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject>

    /** Read a page of courses. Control what is returned via the `properties` query param. */
    fun list(): CompletableFuture<CourseListPageAsync> = list(CourseListParams.none())

    /** @see list */
    fun list(
        params: CourseListParams = CourseListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CourseListPageAsync>

    /** @see list */
    fun list(
        params: CourseListParams = CourseListParams.none()
    ): CompletableFuture<CourseListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<CourseListPageAsync> =
        list(CourseListParams.none(), requestOptions)

    /** Move an Object identified by `{courseId}` to the recycling bin. */
    fun delete(courseId: String): CompletableFuture<Void?> =
        delete(courseId, CourseDeleteParams.none())

    /** @see delete */
    fun delete(
        courseId: String,
        params: CourseDeleteParams = CourseDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().courseId(courseId).build(), requestOptions)

    /** @see delete */
    fun delete(
        courseId: String,
        params: CourseDeleteParams = CourseDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(courseId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: CourseDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: CourseDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(courseId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(courseId, CourseDeleteParams.none(), requestOptions)

    /**
     * Read an Object identified by `{courseId}`. `{courseId}` refers to the internal object ID by
     * default, or optionally any unique property value as specified by the `idProperty` query
     * param. Control what is returned via the `properties` query param.
     */
    fun get(courseId: String): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(courseId, CourseGetParams.none())

    /** @see get */
    fun get(
        courseId: String,
        params: CourseGetParams = CourseGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(params.toBuilder().courseId(courseId).build(), requestOptions)

    /** @see get */
    fun get(
        courseId: String,
        params: CourseGetParams = CourseGetParams.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(courseId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: CourseGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations>

    /** @see get */
    fun get(params: CourseGetParams): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        courseId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(courseId, CourseGetParams.none(), requestOptions)

    /** Fetch objects using a search query */
    fun search(
        params: CourseSearchParams
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: CourseSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject>

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(
            CourseSearchParams.builder()
                .publicObjectSearchRequest(publicObjectSearchRequest)
                .build(),
            requestOptions,
        )

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(publicObjectSearchRequest, RequestOptions.none())

    /**
     * A view of [CourseServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CourseServiceAsync.WithRawResponse

        fun batch(): BatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/0-410`, but is otherwise the
         * same as [CourseServiceAsync.create].
         */
        fun create(
            params: CourseCreateParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: CourseCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>>

        /** @see create */
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            create(
                CourseCreateParams.builder()
                    .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                    .build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            create(simplePublicObjectInputForCreate, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /crm/objects/2026-03/0-410/{courseId}`, but is
         * otherwise the same as [CourseServiceAsync.update].
         */
        fun update(
            courseId: String,
            params: CourseUpdateParams,
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(courseId, params, RequestOptions.none())

        /** @see update */
        fun update(
            courseId: String,
            params: CourseUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(params.toBuilder().courseId(courseId).build(), requestOptions)

        /** @see update */
        fun update(
            params: CourseUpdateParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: CourseUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>>

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/0-410`, but is otherwise the
         * same as [CourseServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<CourseListPageAsync>> =
            list(CourseListParams.none())

        /** @see list */
        fun list(
            params: CourseListParams = CourseListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CourseListPageAsync>>

        /** @see list */
        fun list(
            params: CourseListParams = CourseListParams.none()
        ): CompletableFuture<HttpResponseFor<CourseListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CourseListPageAsync>> =
            list(CourseListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /crm/objects/2026-03/0-410/{courseId}`, but is
         * otherwise the same as [CourseServiceAsync.delete].
         */
        fun delete(courseId: String): CompletableFuture<HttpResponse> =
            delete(courseId, CourseDeleteParams.none())

        /** @see delete */
        fun delete(
            courseId: String,
            params: CourseDeleteParams = CourseDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().courseId(courseId).build(), requestOptions)

        /** @see delete */
        fun delete(
            courseId: String,
            params: CourseDeleteParams = CourseDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(courseId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: CourseDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: CourseDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            courseId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(courseId, CourseDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/0-410/{courseId}`, but is
         * otherwise the same as [CourseServiceAsync.get].
         */
        fun get(
            courseId: String
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(courseId, CourseGetParams.none())

        /** @see get */
        fun get(
            courseId: String,
            params: CourseGetParams = CourseGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(params.toBuilder().courseId(courseId).build(), requestOptions)

        /** @see get */
        fun get(
            courseId: String,
            params: CourseGetParams = CourseGetParams.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(courseId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: CourseGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>>

        /** @see get */
        fun get(
            params: CourseGetParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            courseId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(courseId, CourseGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/0-410/search`, but is
         * otherwise the same as [CourseServiceAsync.search].
         */
        fun search(
            params: CourseSearchParams
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(params, RequestOptions.none())

        /** @see search */
        fun search(
            params: CourseSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>>

        /** @see search */
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(
                CourseSearchParams.builder()
                    .publicObjectSearchRequest(publicObjectSearchRequest)
                    .build(),
                requestOptions,
            )

        /** @see search */
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(publicObjectSearchRequest, RequestOptions.none())
    }
}
