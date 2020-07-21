package com.appoutlet.api.repository

import com.appoutlet.api.model.AppOutletApplication
import org.springframework.data.mongodb.repository.MongoRepository

interface AppOutletApplicationRepository : MongoRepository<AppOutletApplication, String>