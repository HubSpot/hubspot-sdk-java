// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.objects

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.CollectionResponseWithTotalSimplePublicObject
import com.hubspot_sdk.api.models.crm.CreatedResponseSimplePublicObject
import com.hubspot_sdk.api.models.crm.PublicObjectSearchRequest
import com.hubspot_sdk.api.models.crm.SimplePublicObject
import com.hubspot_sdk.api.models.crm.SimplePublicObjectInputForCreate
import com.hubspot_sdk.api.models.crm.SimplePublicObjectWithAssociations
import com.hubspot_sdk.api.models.crm.objects.courses.CourseCreateParams
import com.hubspot_sdk.api.models.crm.objects.courses.CourseDeleteParams
import com.hubspot_sdk.api.models.crm.objects.courses.CourseGetParams
import com.hubspot_sdk.api.models.crm.objects.courses.CourseListPage
import com.hubspot_sdk.api.models.crm.objects.courses.CourseListParams
import com.hubspot_sdk.api.models.crm.objects.courses.CourseSearchParams
import com.hubspot_sdk.api.models.crm.objects.courses.CourseUpdateParams
import com.hubspot_sdk.api.services.blocking.crm.objects.courses.BatchService
import java.util.function.Consumer

interface CourseService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CourseService

    fun batch(): BatchService

    /**
     * Create a course with the given properties and return a copy of the object, including the ID.
     * Documentation and examples for creating standard courses is provided.
     */
    fun create(params: CourseCreateParams): CreatedResponseSimplePublicObject =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CourseCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreatedResponseSimplePublicObject

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreatedResponseSimplePublicObject =
        create(
            CourseCreateParams.builder()
                .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
    ): CreatedResponseSimplePublicObject =
        create(simplePublicObjectInputForCreate, RequestOptions.none())

    /**
     * Perform a partial update of an Object identified by `{courseId}`or optionally a unique
     * property value as specified by the `idProperty` query param. `{courseId}` refers to the
     * internal object ID by default, and the `idProperty` query param refers to a property whose
     * values are unique for the object. Provided property values will be overwritten. Read-only and
     * non-existent properties will result in an error. Properties values can be cleared by passing
     * an empty string.
     */
    fun update(courseId: String, params: CourseUpdateParams): SimplePublicObject =
        update(courseId, params, RequestOptions.none())

    /** @see update */
    fun update(
        courseId: String,
        params: CourseUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject = update(params.toBuilder().courseId(courseId).build(), requestOptions)

    /** @see update */
    fun update(params: CourseUpdateParams): SimplePublicObject =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CourseUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    /** Read a page of courses. Control what is returned via the `properties` query param. */
    fun list(): CourseListPage = list(CourseListParams.none())

    /** @see list */
    fun list(
        params: CourseListParams = CourseListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CourseListPage

    /** @see list */
    fun list(params: CourseListParams = CourseListParams.none()): CourseListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CourseListPage =
        list(CourseListParams.none(), requestOptions)

    /** Move an Object identified by `{courseId}` to the recycling bin. */
    fun delete(courseId: String) = delete(courseId, CourseDeleteParams.none())

    /** @see delete */
    fun delete(
        courseId: String,
        params: CourseDeleteParams = CourseDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().courseId(courseId).build(), requestOptions)

    /** @see delete */
    fun delete(courseId: String, params: CourseDeleteParams = CourseDeleteParams.none()) =
        delete(courseId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: CourseDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: CourseDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(courseId: String, requestOptions: RequestOptions) =
        delete(courseId, CourseDeleteParams.none(), requestOptions)

    /**
     * Read an Object identified by `{courseId}`. `{courseId}` refers to the internal object ID by
     * default, or optionally any unique property value as specified by the `idProperty` query
     * param. Control what is returned via the `properties` query param.
     */
    fun get(courseId: String): SimplePublicObjectWithAssociations =
        get(courseId, CourseGetParams.none())

    /** @see get */
    fun get(
        courseId: String,
        params: CourseGetParams = CourseGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations =
        get(params.toBuilder().courseId(courseId).build(), requestOptions)

    /** @see get */
    fun get(
        courseId: String,
        params: CourseGetParams = CourseGetParams.none(),
    ): SimplePublicObjectWithAssociations = get(courseId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: CourseGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations

    /** @see get */
    fun get(params: CourseGetParams): SimplePublicObjectWithAssociations =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(courseId: String, requestOptions: RequestOptions): SimplePublicObjectWithAssociations =
        get(courseId, CourseGetParams.none(), requestOptions)

    fun search(params: CourseSearchParams): CollectionResponseWithTotalSimplePublicObject =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: CourseSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject =
        search(
            CourseSearchParams.builder()
                .publicObjectSearchRequest(publicObjectSearchRequest)
                .build(),
            requestOptions,
        )

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest
    ): CollectionResponseWithTotalSimplePublicObject =
        search(publicObjectSearchRequest, RequestOptions.none())

    /** A view of [CourseService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CourseService.WithRawResponse

        fun batch(): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/v3/objects/0-410`, but is otherwise the same
         * as [CourseService.create].
         */
        @MustBeClosed
        fun create(params: CourseCreateParams): HttpResponseFor<CreatedResponseSimplePublicObject> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: CourseCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreatedResponseSimplePublicObject>

        /** @see create */
        @MustBeClosed
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreatedResponseSimplePublicObject> =
            create(
                CourseCreateParams.builder()
                    .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                    .build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
        ): HttpResponseFor<CreatedResponseSimplePublicObject> =
            create(simplePublicObjectInputForCreate, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /crm/v3/objects/0-410/{courseId}`, but is
         * otherwise the same as [CourseService.update].
         */
        @MustBeClosed
        fun update(
            courseId: String,
            params: CourseUpdateParams,
        ): HttpResponseFor<SimplePublicObject> = update(courseId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            courseId: String,
            params: CourseUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            update(params.toBuilder().courseId(courseId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: CourseUpdateParams): HttpResponseFor<SimplePublicObject> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: CourseUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>

        /**
         * Returns a raw HTTP response for `get /crm/v3/objects/0-410`, but is otherwise the same as
         * [CourseService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<CourseListPage> = list(CourseListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: CourseListParams = CourseListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CourseListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: CourseListParams = CourseListParams.none()
        ): HttpResponseFor<CourseListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CourseListPage> =
            list(CourseListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /crm/v3/objects/0-410/{courseId}`, but is
         * otherwise the same as [CourseService.delete].
         */
        @MustBeClosed
        fun delete(courseId: String): HttpResponse = delete(courseId, CourseDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            courseId: String,
            params: CourseDeleteParams = CourseDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().courseId(courseId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            courseId: String,
            params: CourseDeleteParams = CourseDeleteParams.none(),
        ): HttpResponse = delete(courseId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: CourseDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: CourseDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(courseId: String, requestOptions: RequestOptions): HttpResponse =
            delete(courseId, CourseDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/v3/objects/0-410/{courseId}`, but is otherwise
         * the same as [CourseService.get].
         */
        @MustBeClosed
        fun get(courseId: String): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(courseId, CourseGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            courseId: String,
            params: CourseGetParams = CourseGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(params.toBuilder().courseId(courseId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            courseId: String,
            params: CourseGetParams = CourseGetParams.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(courseId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: CourseGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations>

        /** @see get */
        @MustBeClosed
        fun get(params: CourseGetParams): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            courseId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(courseId, CourseGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/v3/objects/0-410/search`, but is otherwise the
         * same as [CourseService.search].
         */
        @MustBeClosed
        fun search(
            params: CourseSearchParams
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(params, RequestOptions.none())

        /** @see search */
        @MustBeClosed
        fun search(
            params: CourseSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>

        /** @see search */
        @MustBeClosed
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(
                CourseSearchParams.builder()
                    .publicObjectSearchRequest(publicObjectSearchRequest)
                    .build(),
                requestOptions,
            )

        /** @see search */
        @MustBeClosed
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(publicObjectSearchRequest, RequestOptions.none())
    }
}
